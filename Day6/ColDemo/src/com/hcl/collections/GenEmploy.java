package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> lstEmploy=new ArrayList<Employ>();
		lstEmploy.add(new Employ(1, "divya",674556));
		lstEmploy.add(new Employ(2, "hari",67664556));
		lstEmploy.add(new Employ(3, "raghu",5674556));
		lstEmploy.add(new Employ(4, "hema",67455666));
		lstEmploy.add(new Employ(5, "jay",67455666));
		System.out.println("employ list ");
		lstEmploy.forEach(System.out::println);		
		}

}
