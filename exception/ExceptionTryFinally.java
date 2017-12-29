package com.startwithjava.harshad.exception;

public class ExceptionTryFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			throw new Exception("hello");
		}catch(Exception e) {
			System.out.println("2");
		}
		System.out.println("3");
		
		
		m1();
	}
	
	public static void m1() {  //form submit
		try {
			m2();
			m3();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error occurs");
		}
	}
	public static void m2() throws Exception { //validation
		boolean flag = false;
		if(!flag)
		throw new Exception();
		
		System.out.println("Validated");
	}
	public static void m3() {  //db operations
		System.out.println("Db inserted");
	}
}
