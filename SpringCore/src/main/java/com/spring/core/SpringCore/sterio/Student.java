package com.spring.core.SpringCore.sterio;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Rohit")
    private String studentName;
	@Value("Earth")
    private String city;
	@Value("#{temp}")
	private List<String>cites;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", cites=" + cites + "]";
	}
	public Student(String studentName, String city, List<String> cites) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.cites = cites;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getCites() {
		return cites;
	}
	public void setCites(List<String> cites) {
		this.cites = cites;
	}
 

 
}
