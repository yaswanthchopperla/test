package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LambdaEmploy {
	public static void main(String[] args) {
		List<Employ> lstEmploy=new ArrayList<Employ>();
		lstEmploy.add(new Employ(1, "divya",11000));
		lstEmploy.add(new Employ(2, "hari",25000));
		lstEmploy.add(new Employ(3, "raghu",65000));
		lstEmploy.add(new Employ(4, "hema",31834));
		lstEmploy.add(new Employ(5, "jay",7000));
		Collections.sort(lstEmploy,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for (Employ employ: lstEmploy) {
			System.out.println(employ);
		}
		System.out.println("-----------");
		Collections.sort(lstEmploy,(p1,p2)->{
			return (int)(p1.basic-p2.basic);//if it return -1 then it sorts.
		});
		for (Employ employ : lstEmploy) {
			System.out.println(employ);
		}
		System.out.println("-----------");
		Collections.sort(lstEmploy,(p1,p2)->{
			return (int)(p1.empno-p2.empno);//if it return -1 then it sorts.
		});
		for (Employ employ : lstEmploy) {
			System.out.println(employ);
		}
		System.out.println("-----------");
		lstEmploy.stream().filter(p->p.basic>15000).forEach(x->{
			System.out.println(x);
		});
	}

}
