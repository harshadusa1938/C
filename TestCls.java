package com.startwithjava.harshad;

public class TestCls implements TestIn,TestIn2{
	@Override
	public void m1() {
		System.out.println("m1");
	}
	@Override
	public void m2() {
		System.out.println("m2");
	}
	@Override
	public void m3() {
		System.out.println("TestCls m3");	
	}
	public void m4() {
	  System.out.println("TestCls m4");
	}
}
