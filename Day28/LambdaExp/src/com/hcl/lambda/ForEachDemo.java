package com.hcl.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("one");
		lst.add("two");
		lst.add("three");
		lst.add("four");
		lst.forEach((var)->System.out.println(var));
		
	}
} 
