package com.spring.core.SpringCore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{23+78}")
 private int x;
	@Value("#{8>4?22:33}")
 private int y;
	@Value("#{T(java.lang.Math).sqrt(64)}")
 private double z;
	@Value("#{T(java.lang.Math).E}")
private double e;
	@Value("#{new java.lang.String('rohit')}")
private String name;
	@Value("#{7>2}")
private boolean isActive;

 public int getX() {
	return x;
 }

 public void setX(int x) {
	this.x = x;
 }

 public int getY() {
	return y;
 }

public void setY(int y) {
	this.y = y;
}

public double getZ() {
	return z;
}

public void setZ(double z) {
	this.z = z;
}

public Demo(int x, int y, double z) {
	super();
	this.x = x;
	this.y = y;
	this.z = z;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getE() {
	return e;
}

public void setE(double e) {
	this.e = e;
}

@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e +",name= " +name+" , isActive=" +isActive+"]";
}

public boolean isActive() {
	return isActive;
}

public void setActive(boolean isActive) {
	this.isActive = isActive;
}

public Demo() {
	super();
	// TODO Auto-generated constructor stub
}
 


}
