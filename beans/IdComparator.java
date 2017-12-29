package com.statwithjava.beans;

import java.util.Comparator;

public class IdComparator implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getId()==o2.getId())
			return 0;
		else if(o1.getId()>o2.getId()) {
			return 1;
		}else {
			return -1;
		}
	}

}
