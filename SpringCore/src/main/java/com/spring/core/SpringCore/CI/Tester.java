package com.spring.core.SpringCore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext  ac=new ClassPathXmlApplicationContext("com/spring/core/SpringCore/CI/CiConfig.xml");
		Addtion addtion=(Addtion) ac.getBean("add");
		System.out.println(addtion.doSum());
	}

}
