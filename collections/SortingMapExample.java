package com.statwithjava.collections;

import java.util.HashMap;

class M implements Comparable{
	int id;
	M(){
	 id=0;
	}
	M(int id){
	  this.id=id;
	}
	@Override
	public int hashCode() {
	 return id;	
	}
	@Override
	public  boolean equals(Object obj) {
		M m2 = (M)obj;
		return m2.id==id;
	}
	@Override
	public int compareTo(Object o) {
		M m = (M)o;          
		//return (m.id==id)?0:(m.id>id)?1:-1;
		return (m.id==id)?0:(id>m.id)?1:-1;
	}
}
public class SortingMapExample {

	public static void main(String[] args) {
		HashMap<M,Integer> map = new HashMap<>();
		
		map.put(new M(1), 1);
		map.put(new M(1), 1);
		map.put(new M(3), 3);
		map.put(new M(4), 4);
		
		
		System.out.println(map.size());
	}

}
