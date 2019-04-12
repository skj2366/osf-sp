package com.osf.sp.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc1/ioc.xml");
		Student s = (Student)ac.getBean("s");
		System.out.println(s);
		Person p1 = (Person)ac.getBean("p");
		Person p2 = s.getP();
		System.out.println(p1==p2);
		
		Person p= new Person();
		Student s2 = new Student(p);
		System.out.println(p==s2.getP());
	}
}
