package com.spring.core.SpringCore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
 private String EmpName;
 private List<String> phoneNos;
 private Set<String>adresses;
 private Map<String,String>Courses;
 
public Employee() {
	super();
}
public Employee(String empName, List<String> phoneNos, Set<String> adresses, Map<String, String> courses) {
	super();
	EmpName = empName;
	this.phoneNos = phoneNos;
	this.adresses = adresses;
	Courses = courses;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public List<String> getPhoneNos() {
	return phoneNos;
}
public void setPhoneNos(List<String> phoneNos) {
	this.phoneNos = phoneNos;
}
public Set<String> getAdresses() {
	return adresses;
}
public void setAdresses(Set<String> adresses) {
	this.adresses = adresses;
}
public Map<String, String> getCourses() {
	return Courses;
}
public void setCourses(Map<String, String> courses) {
	Courses = courses;
}
@Override
public String toString() {
	return "Employee [EmpName=" + EmpName + ", phoneNos=" + phoneNos + ", adresses=" + adresses + ", Courses=" + Courses
			+ "]";
}

 
}
