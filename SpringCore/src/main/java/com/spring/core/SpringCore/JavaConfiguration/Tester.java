package com.spring.core.SpringCore.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JConfig.class);
		Student student= context.getBean("getStudent",Student.class);
		student.study();
	}
}
