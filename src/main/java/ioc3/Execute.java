package ioc3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc3/ioc3.xml");
		Person p = (Person)ac.getBean("p");
		System.out.println(p);
		
	}
}
