package com.startwithjava.harshad;
public class InterfaceTest {
	public static void main(String[] args) {
		TestIn2 test = new TestCls();
		test.m1();
		test.m2();
		test.m3();
		TestIn2.m4();
		
		//Annoymous class
			My obj = new My(){
			@Override
			public void m1() {
			  System.out.println("My m1");	
			}

			@Override
			public void m2() {
				 System.out.println("My m2");
			}
		};
		obj.m1();
		obj.m2();
		
		My obj2 = new My(){
			@Override
			public void m1() {
			  System.out.println("My m1 2");	
			}

		     	@Override
			public void m2() {
				 System.out.println("My m2 2");
			}
		};
		obj2.m1();
		obj2.m2();
		
	
	}
}


interface My{
	public  void m1();
	public  void m2();
}
interface TestIn{
	public void m1();
}
interface TestIn2{
	public void m1();
	public void m2();
	
	//Java 8 default method
	public default void m3() {
	  System.out.println("m3");
	}
	
	//Java 8
	public static void m4() {
	  System.out.println("m4");
	}
}

