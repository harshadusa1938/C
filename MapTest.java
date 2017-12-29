package com.statwithjava;

import java.util.HashMap;
import java.util.Random;

class OurClass{
	public int hashCode() {
	  Random r = new Random();
	  return r.nextInt();
	}
	@Override
	public boolean equals(Object object) {
		return true;
	}
}
public class MapTest {

	public static void main(String[] args) {
		HashMap<OurClass,Integer> map = new HashMap<>();
		map.put(new OurClass(),1);
		map.put(new OurClass(),2);
		
		System.out.println(map.size());

	}

}
