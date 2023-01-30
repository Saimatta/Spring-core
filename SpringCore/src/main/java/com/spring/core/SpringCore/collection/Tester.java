package com.spring.core.SpringCore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/core/SpringCore/collection/CollectionConfig.xml");
		Employee emp=(Employee) context.getBean("employee1");
		System.out.println(emp);
	}

}
