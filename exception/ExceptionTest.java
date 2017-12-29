package com.startwithjava.harshad.exception;

import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args){
		
		try {
			
		}catch(RuntimeException e) {
			e.printStackTrace();
			System.out.println("Divisor should be greater than zero");
		}
		finally {
			System.out.println("finally block----");
		}
		
		ExceptionTest obj= new ExceptionTest();
		
		int age = 17;
	    try {
			obj.canVote(age);
		} catch (NotValidAge e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void canVote(int age) throws NotValidAge {
		if(age>=18) {
			System.out.println("Can vote");
		}else {
			throw new NotValidAge("You cannot vote");
		}	
	}

}
