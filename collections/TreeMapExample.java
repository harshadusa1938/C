package com.statwithjava.collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
	
		TreeMap<M,Integer> treeMap= new TreeMap<>();
		treeMap.put(new M(1), 100);
		treeMap.put(new M(3), 200);
		treeMap.put(new M(1), 300);

		System.out.println(treeMap.size());
		
		//treeMap.forEach((k,v)->System.out.println("Key="+k.id+",value="+v));
	}

}

