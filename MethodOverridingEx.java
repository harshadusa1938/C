package com.startwithjava.harshad;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverridingEx {

	public static void main(String[] args) {
		 Child2 p;
		 p= new Child2();
		 try {
			p.display();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
class Parent{
	public void display() throws IOException{
		System.out.println("Parent");
	}
}
class Child2 extends Parent{
public void display() throws FileNotFoundException{
	System.out.println("Child");	
 }
}
