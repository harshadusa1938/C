package com.statwithjava;

public class LamdaEx {

	public static void main(String[] args) {
		A a = (LamdaEx::hello);
		a.test();		
	}
	public static void hello() {
		System.out.println("###################ABC****************");
	}

}

interface A{
	public abstract void test();
}