package com.spring.core.SpringCore.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/SpringCore/AutoWiring/AutoConfig.xml");
		Emp employee=context.getBean("emp1",Emp.class);
		System.out.println(employee);
	}

}
