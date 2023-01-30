package com.spring.core.SpringCore.CI;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certification certificate;
	private List<String>sports;
	
	public Person(String name,int personId ,Certification certi,List<String>list) {
	   this.name=name;
	   this.personId=personId;
	   this.certificate=certi;
	   this.sports=list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certificate=" + certificate + ", sports=" + sports
				+ "]";
	}

	
	
}
