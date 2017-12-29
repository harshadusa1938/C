package com.statwithjava;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String x = "hello";
		switch(x){
		  case "hello":{
			  int s=10;
		   System.out.println("X="+x);
		  }
		  break;
		  case "hi":
		  System.out.println("X="+x);
		  break;
		  case "test":
			  System.out.println("X="+x);
			  break;
		  case "abc":
			  System.out.println("X="+x);
			  break;  
		  default :
		  System.out.println("Nothing found");
		}*/
		
		
		String s = "hi";
		switch(s){
		  case "hello":
		   int x = 10;
		   System.out.println("X="+x);
		  break;
		  case "hi":
		  x= 20;
		  System.out.println("X="+x);
		  break;
		  default :
		  System.out.println("Nothing found");
		}
	}

}
