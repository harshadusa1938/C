package com.startwithjava.harshad;
public class InheritanceTest {
	public static void main(String[] args) {
		Child c = new Child();
		Base c2 = new Child(10,20,30);
		c2.display();
		c2.test();
		Base b1 = new Base(10,20);
		
		//Runtime Polymorphism
		Base b = b1;
		b.test();
	}
}

class Base{
	private int x;
	private int y;
	
	public Base() {
		super();
		System.out.println("Parent constructor");
	}

	public Base(int x, int y) {
		System.out.println("Parent parameterized constructor");
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public void test() {
		System.out.println("Parent Test");
	}
	public void display() {
		
	}
	
	
}
class Child extends Base{
	private int z;
	public Child() {
		super();
		System.out.println("Child constructor");
		z=0;
	}
	public Child(int x,int y,int z) {
		super(x,y);
		this.z = z; 
		System.out.println("Child parameterized constructor");
	}
	public void display() {
		System.out.println(getX());
		System.out.println(getY());
		System.out.println(z);
	}
	public void test(float a,int b) {
		System.out.println("Child Test");
	}
	public void test(int x,float b) {
		System.out.println("Child Test");
	}
	public void test() {
		System.out.println("Child Test");
	}
}