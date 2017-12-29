package com.statwithjava.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.statwithjava.beans.Category;
import com.statwithjava.beans.Customer;
import com.statwithjava.beans.IdComparatorDesc;
import com.statwithjava.beans.Product;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Customer> customers = new ArrayList<>();
		
		list.add("Hi");
		list.add("ABC");
		list.add("Hello");
		
		Collections.sort(list);	
		
		//Customers
		customers.add(new Customer(10,"Raj"));
		customers.add(new Customer(2,"Amit"));
		customers.add(new Customer(1,"Sohnan"));
		//Collections.sort(customers);
		
		//Collections.sort(customers, new IdComparator());
		//Collections.sort(customers, new NameComparator());
		
		customers.sort(new IdComparatorDesc());
	
		System.out.println(list);
		System.out.println(customers);
		
		Category c = new Category(1,"Cat1");
		Product p = new Product(1,"A",889.0,c);
	}

}
