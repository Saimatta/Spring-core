package com.spring.core.SpringCore.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring.core.SpringCore.JavaConfiguration")
public class JConfig {
	@Bean
	public Samosa getSamosa() {
	  return new Samosa();
	}
	@Bean
   public Student getStudent() {   
	   return new Student(getSamosa());
   }
}
