package com.statwithjava;

public class Test {
	private String firstName;
    /*{
		x = 10;
	}
	public Test(){
		x =10;
	}
	public Test(int a){
		x =a;
	}
	*/
	
	
	public static int sum(int n1,int n2){
		return n1+n2;
	}
	public void display(){
		System.out.println("Value of X="+firstName);
	}
	public static void print(){
		System.out.println("Print method is invoked");
	}
	public static void main(String args[]){
		System.out.println("This is my first application");
		Test t1 = new Test();
		//Test t2 = new Test(15);
		t1.display();
		int c = Test.sum(10, 20);
		System.out.println("Sum="+c);
		//t2.display();
		Test.print();
		
		Student s1 = new Student();
		Student s2 = new Student(100,"Ram","BCA","New Delhi");
		Student s3 = new Student(101,"Ramesh","MCA","Patna");
		
		s1.display();
		s2.display();
		s3.display();
	}
}
