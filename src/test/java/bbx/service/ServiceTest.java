package bbx.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import bbx.utils.Utils;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class ServiceTest {
	
	@Autowired
	AccountBookService abService;
	
	@Autowired
	AccountService aService;
	
//	@Autowired
//	ExpenseService eService;
	
	@Autowired
	TypeService tService;
	
	@Autowired
	UserService uService;
	
	@Test
	public void testServiceIOC() {
		Utils.ps(aService,abService,tService,uService);
	}
	
	@Test
	public void testTypeService() {
		tService.getLevelOneTypesByAccountBookId("7").forEach(System.out::println);
	}

}
