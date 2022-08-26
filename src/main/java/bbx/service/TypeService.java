package bbx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bbx.bean.Type;
import bbx.bean.TypeExample;
import bbx.mapper.TypeMapper;

@Service
public class TypeService {
	
	@Autowired
	TypeMapper typeMapper;

	public List<Type> getLevelOneTypesByAccountBookId(String accountBookId) {
		TypeExample typeExm = new TypeExample();
		typeExm.createCriteria().andAccountbookIdIsNull().andTypeParentIsNull();
		typeExm.or().andAccountbookIdEqualTo(accountBookId).andTypeParentIsNull();
		return typeMapper.selectByExample(typeExm);
	}

	public List<Type> getLevelTwoTypesByAccountBookId(String accountBookId, String parentId) {
		TypeExample typeExm = new TypeExample();
		typeExm.createCriteria().andAccountbookIdEqualTo(accountBookId).andTypeParentEqualTo(parentId);
		typeExm.or().andAccountbookIdIsNull().andTypeParentEqualTo(parentId);
		return typeMapper.selectByExample(typeExm);
	}

	public int saveType(Type type) {
		int id = typeMapper.insertSelective(type);
		return id;
	}

	
}
