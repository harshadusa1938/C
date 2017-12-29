package com.startwithjava.harshad.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionSequenceStatment {
	public static void main(String[] args){
		try {
			int a = 20;
			int b =2;
			int c = a/b;
			System.out.println("C="+c);
			
			System.out.println("00000");
			File f = new File("test.text");
			FileInputStream fis = new FileInputStream(f);			
			System.out.println("Divisor should be greater than zero 0");
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("IOException dddd");
			
			System.out.println("222222222");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception 000");
		}
		
		System.out.println("Divisor should be greater than zero 1");
		System.out.println("Divisor should be greater than zero 2");
	}
	

}
