package mypack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
	
		Customer c1 =new Customer(1,"Raj");
		Customer c2 =new Customer(2,"Ram");
		//System.out.println(c1);
		
		Customer[] arr = new Customer[2];
		arr[0] = c1;
		arr[1] = c2;
		
		for(Customer c:arr) {
			System.out.println(c);
		}
		
		//List interface  - It can hold duplicate elements
		//List interface  - It can hold duplicate elements
		//SEt interface - Only unique elements
		//Map  = To store key,value pair
		//Queque = FIFO
		//Staack = LIFO
		
		//List interface 
		//implemented classes
		//1)ArrayList
		//2)Vector
		//3)LinkedList
	
		ArrayList list = new ArrayList();
		list.add("aa");
		list.add(120);
		list.add(175.25);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
		}
		
		List<Customer> list2 = new ArrayList<>();
		list2.add(c1);
		list2.add(c2);
		
		List<Customer> list3 = new ArrayList<>();
		
		for(Customer c:list3) {
			System.out.println(c);
		}
		
		list2.set(0, c2);		
		list3.addAll(list2);
		
		if(list3.contains(c1)) {
			System.out.println("FOund");
		}else {
			System.out.println("Not FOund");
		}
		
		
		Customer obj = list2.get(1);
		System.out.println(obj);
		
		for(Customer c:list2) {
			System.out.println(c);
		}
	}
}

class Customer{
	private int id;
	private String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public String toString() {
		return "id="+id+"\tname="+name;
	}
	
}