package com.statwithjava.beans;

import java.util.Comparator;

public class IdComparatorDesc implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		if(o2.getId()==o1.getId())
			return 0;
		else if(o2.getId()>o1.getId()) {
			return 1;
		}else {
			return -1;
		}
	}

}
