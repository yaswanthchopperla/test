package com.hcl.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c=new NameComparator();
		Set<Employ> SetEmploy=new TreeSet<Employ>(c);
		SetEmploy.add(new Employ(1, "divya",674556));
		SetEmploy.add(new Employ(2, "hari",67664556));
		SetEmploy.add(new Employ(3, "raghu",5674556));
		SetEmploy.add(new Employ(4, "hema",67455666));
		SetEmploy.add(new Employ(5, "jay",67455666));
		System.out.println("employ list ");
		SetEmploy.forEach(System.out::println);		
		}

}
