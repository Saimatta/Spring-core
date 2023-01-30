package com.spring.core.SpringCore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/SpringCore/standlone/AloneConfig.xml");
		Person p;
		p=context.getBean("person1",Person.class);
		p.toString();
	}

}
