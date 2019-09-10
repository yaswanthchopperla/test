package com.hcl.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Employ>{

	@Override
	public int compare(Employ arg0, Employ arg1) {
		return arg0.name.compareTo(arg1.name);
	}

}
