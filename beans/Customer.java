package com.statwithjava.beans;

public class Customer implements Comparable{
	private int id;
	private String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Customer() {
		super();
	}
	public String toString() {
		return id+" "+name;
	}
	@Override
	public int compareTo(Object o) {
		Customer c = (Customer)o;
		//return this.name.compareTo(c.name);	
		
		if(id==c.id)
			return 0;
		else if(id>c.id) {
			return 1;
		}else {
			return -1;
		}
		//1 == current object bigger than second
		//-1 = first one is smaller than 2nd
		//0 both object are equals
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
