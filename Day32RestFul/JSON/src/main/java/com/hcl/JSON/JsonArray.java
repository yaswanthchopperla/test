package com.hcl.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonArray {
  public static void main(String[] args) {
	JSONObject obj=new JSONObject();
	for (int i = 0; i <4; i++) {
		JSONArray ar=new JSONArray();
		ar.add("sonoo");    
		ar.add(new Integer(i));    
		ar.add(new Double(1000*i));   
		//System.out.print(ar);
		obj.put(i, ar);
	}
	System.out.println(obj);
	
}
}
