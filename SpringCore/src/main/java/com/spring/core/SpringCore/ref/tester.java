package com.spring.core.SpringCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tester {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/SpringCore/ref/RefConfig.xml");
		 A Aob=(A) context.getBean("aref");
		 B Bob=(B) context.getBean("bref");
		 System.out.println(Aob);
		 System.out.println(Bob);	 
	}

}
