package ssh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzit.bean.Dept;
import com.hzit.service.impl.DeptServiceImpl;

public class DeptTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DeptServiceImpl bean = context.getBean(DeptServiceImpl.class);
		Dept dept = new Dept();
		dept.setDname("技术部");
		dept.setLoc("深圳");
		bean.addorupdateDept(dept);
		
		
		
	}
}
