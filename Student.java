package com.statwithjava;

public class Student {
    private int rollNumber;
	private static String schoolName;
	private String name;
	private String courseName;
	private String address;
	
	static{
		schoolName = "ABC school";
	}
	public Student(){
		
	}
	public Student(int roll,String name,String courseName,String address){
		rollNumber = roll;
		this.name = name;
		this.courseName=courseName;
		this.address=address;
	}
	public void display(){
		System.out.println("===============Information of Student=================");
		System.out.println("Name:-"+name);
		System.out.println("Roll Number:-"+rollNumber);
		System.out.println("School Name:-"+schoolName);
		System.out.println("Address:-"+address);
		System.out.println("Course Name:-"+courseName);
	}
}
