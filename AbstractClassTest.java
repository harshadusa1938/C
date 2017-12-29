package com.startwithjava.harshad;
public class AbstractClassTest {
	public static void main(String[] args) {
		Shape obj = new Rectangle();
		obj.area();
		obj.perimeter();
		
		Shape obj2 = new Rectangle(10,20);
		obj2.area();
		obj2.perimeter();
		
		Shape obj3 = new Circle(2);
		obj3.area();
		obj3.perimeter();
		
		Shape obj4= new Square(10);
		obj4.area();
		obj4.perimeter();
	}	
}
abstract class Shape{
	public abstract void area();
	public abstract void perimeter();
	public Shape() {
		System.out.println("Shape cons");
	}
}
class Rectangle extends Shape{
	private int l,b;
	public Rectangle() {
		System.out.println("Rectangle def cons");
	}
	public Rectangle(int l,int b) {
		this.l =l;
		this.b=b;
		System.out.println("Rectangle par cons");
	}
	public void area() {
		System.out.println("Area ="+(l*b));
	}
	public void perimeter(){
		System.out.println("Area ="+2*(l+b));
	}
}

class Circle extends Shape{
    private int radius;
	public Circle(int radius) {
		super();
		this.radius = radius;
    }

	@Override
	public void area() {
		System.out.println(Math.PI*radius*radius);
	}

	@Override
	public void perimeter() {
		System.out.println(2*Math.PI*radius);
		
	}
}

class Square extends Shape{
    private int side;
    
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println(side*side);
	}

	@Override
	public void perimeter() {
		System.out.println(4*side);
	}
}
