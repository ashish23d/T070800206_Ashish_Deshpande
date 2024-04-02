package com.irctc.registration;

public class Student {

	private int sid;
	private String sname;
	private String city;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//non static Block
	{
		System.out.println("THis is non- static student class");
	}

	public static void demo() {

	}
	static {

	}
	public Student() {
		System.out.println("This is Constructor");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();

	}
}
