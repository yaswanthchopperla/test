package com.y;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class HelloWorld {
     @WebMethod
     public String sayHelloWorld(String message)throws MissingName{
    	 if(message==null || message.isEmpty()){
    		 throw new MissingName();
    	 }
    	 return "Here is the message :"+message+"";
     }
}
