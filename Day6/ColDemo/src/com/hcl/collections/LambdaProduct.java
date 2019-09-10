package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaProduct {
public static void main(String[] args) {
	List<Product> list=new ArrayList<Product>();
	list.add(new Product(1,"Hp laptop", 74000));
	list.add(new Product(2,"Dell laptop", 44000));
	list.add(new Product(3,"Lenovo laptop", 54000));
	Collections.sort(list,(p1,p2)->{
		return p1.name.compareTo(p2.name);
	});
	for (Product product : list) {
		System.out.println(product);
	}
	Collections.sort(list,(p1,p2)->{
		return (int)(p1.price-p2.price);//if it return -1 then it sorts.
	});
	for (Product product : list) {
		System.out.println(product);
	}
	Product maxP=list.stream().max((p1,p2)->p1.price>=p2.price ? 1 :-1).get();
	System.out.println("max price is:");
	System.out.println(maxP);
	Product minP=list.stream().min((p1,p2)->p1.price>=p2.price ? 1 :-1).get();
	System.out.println("min price is:");
	System.out.println(minP);
}
}
