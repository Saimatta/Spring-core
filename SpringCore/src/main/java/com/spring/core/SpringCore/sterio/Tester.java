package com.spring.core.SpringCore.sterio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/core/SpringCore/sterio/SterioConfig.xml");
		Student student=context.getBean("student",Student.class);
		System.out.println(student.getCites().getClass().getName());
	}
     
}
