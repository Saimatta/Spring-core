package com.spring.core.SpringCore.CI;

public class Addtion {
	private int a;
	private int b;
	public Addtion(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int,int");
	}
	public Addtion(double a, double b) {
		this.a = (int )a;
		this.b = (int )b;
		System.out.println("double,double");
	}
	public Addtion(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String,String");
	}
	public int doSum() {
		return this.a+this.b;
	}
	
}
