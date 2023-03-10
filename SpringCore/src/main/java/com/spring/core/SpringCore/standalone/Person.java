 package com.spring.core.SpringCore.standalone;

import java.util.List;

public class Person {
	private List<String>friends;

	public Person() {
		super();
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}

}
