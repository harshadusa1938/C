package com.statwithjava;

public class StringTest {
	public static void main(String[] args) {
	  
	   //String Object creating using literals	and will created in string constant pool
	   String s = "hello";	
	   String s2 = "hello";
	   String s4 = "                      hello ";
	   
	   s = s + " hi";
	   
	   //String Object creating using new keyword	
	   String s3 = new String("hello");
	   
	   //Both s and s2 have same reference as they are pointing to same object
	   System.out.println(s==s2);
	   
	    //Both s has reference from string pool and s3 is created in heap memory and does have 
	   //different reference that's they are not equal
	   
	   System.out.println(s==s3);
	   System.out.println("s2==s4 "+(s2==s4));
	   
	   
	   //byte,short,int,long   = Integers
	   //float and double = decimals
	   //boolean  = true and false
	   
	   char c = 'A';
	   char ch = 48;
	   
	   System.out.println(ch);
	   
	   System.out.println(s4.trim());
	   
	   char chArray[] = s.toCharArray();
	   
	   for(int i=0;i<chArray.length;i++) {
		   System.out.println("Char="+chArray[i]);
	   }
	   
	   
	}
}
