package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
	public static void main(String[] args) {
		List<Employ> lstEmploy=new ArrayList<Employ>();
		lstEmploy.add(new Employ(1, "divya",674));
		lstEmploy.add(new Employ(2, "hari",676));
		lstEmploy.add(new Employ(3, "raghu",567));
		lstEmploy.add(new Employ(4, "hema",677));
		lstEmploy.add(new Employ(5, "jay",679));
		lstEmploy.stream().filter(p->p.basic>=670).forEach(x->{
			System.out.println(x);
		});
		System.out.println("names starts with s");
		lstEmploy.stream().filter(p->p.name.startsWith("h")).forEach(x->{
			System.out.println(x);
		});	
	}
}
