package bbx.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import bbx.utils.Utils;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	AccountBookMapper abMapper;
	
	@Autowired
	AccountMapper aMapper;
	
	@Autowired
	ExpenseMapper eMapper;
	
	@Autowired
	TypeMapper tMapper;
	
	@Autowired
	UserMapper uMapper;
	
	@Test
	public void testMapperIOC() {
		Utils.ps(aMapper,abMapper,eMapper,tMapper,uMapper);
	}

}
