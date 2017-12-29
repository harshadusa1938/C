package com.statwithjava.beans;

public class Product {
	private int id;
	private String name;
	private double price;
	private Category category;
	public Product(int id, String name, double price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
}
