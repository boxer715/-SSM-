package bbx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bbx.bean.Msg;
import bbx.bean.Type;
import bbx.service.TypeService;

@RestController
public class TypeController {
	
	@Autowired
	TypeService typeService;

	@GetMapping("oneTypes")
	public Msg getLevelOneTypes(@RequestParam("accountBookId") String accountBookId){
		List<Type> levelOneTypes = typeService.getLevelOneTypesByAccountBookId(accountBookId);
		return Msg.success().add("typeOneList", levelOneTypes);
	}
	
	@GetMapping("twoTypes")
	public Msg getLevelTwoTypes(@RequestParam("accountBookId") String accountBookId,
								@RequestParam("parentId") String parentId){
		List<Type> levelTwoTypes = typeService.getLevelTwoTypesByAccountBookId(accountBookId,parentId);
		return Msg.success().add("typeTwoList", levelTwoTypes);
	}
	
	@PostMapping("type")
	public Msg saveType(Type type) {
		String parentId = type.getTypeParent() == "" ? null : type.getTypeParent();
		type.setTypeParent(parentId);
		typeService.saveType(type);
		return Msg.success().add("type", type);
	}
}
