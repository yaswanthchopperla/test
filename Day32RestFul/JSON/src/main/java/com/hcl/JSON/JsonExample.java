package com.hcl.JSON;

import org.json.simple.JSONObject;

public class JsonExample {
     public static void main(String[] args) {
    	 JSONObject obj=new JSONObject();    
    	  obj.put("name","sonoo");    
    	  obj.put("age",new Integer(27));    
    	  obj.put("salary",new Double(600000));    
    	   System.out.print(obj);    
    	}   

	}

