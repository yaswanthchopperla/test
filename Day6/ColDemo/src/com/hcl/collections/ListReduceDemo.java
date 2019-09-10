package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ListReduceDemo {
	public static void main(String[] args) {
		
//reduce keyword example.		
//List<Integer> lst=new ArrayList<Integer>();
//		lst.add(1);
//		lst.add(2);
//		lst.add(3);
//		lst.add(4);
//		lst.add(5);
//		lst.add(6);
//		int sum=lst.stream().reduce(0,(e1,e2)->e1+e2);
//		System.out.println(sum);

//limit and skip keyword example.		
		List<Integer> lstData=new ArrayList<Integer>();
		lstData.add(new Integer(42));
	    lstData.add(new Integer(52));
	    lstData.add(new Integer(12));
	    lstData.add(new Integer(78));
	    lstData.add(new Integer(82));
		System.out.println("for limiting the input:");
		lstData.stream().limit(3).forEach(p->{
			System.out.println(p);
		});
		System.out.println("after skipping:" );
		lstData.stream().skip(1).forEach(p->{
			System.out.println(p);
		});
	}

}
