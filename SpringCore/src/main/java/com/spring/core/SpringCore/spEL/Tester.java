package com.spring.core.SpringCore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/SpringCore/spEL/Config.xml");
        Demo demo=context.getBean("demo",Demo.class);
        System.out.println(demo);
	}

}
