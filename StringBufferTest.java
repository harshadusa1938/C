package com.statwithjava;

public class StringBufferTest {
	public static void main(String[] args) {	
		StringBuffer sb = new StringBuffer();
		sb.append("Ram\t");
		sb.append("Kumar");
		
		String s =sb.toString();
		int l = sb.length();
		System.out.println(s);
		System.out.println(l);
		
		System.out.println(sb.charAt(8));
		sb.replace(0, 1, "h");
		s =sb.toString();
		
		System.out.println(s);
		
		s= s.replaceAll("a", "R");
		
		System.out.println(s);
		
		sb.delete(0,2);
	    sb.deleteCharAt(0);
		
		System.out.println(sb);
		
		
	}
}
