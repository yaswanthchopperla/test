package main;

import java.rmi.RemoteException;

//import com.y.HelloWorldProxy;

import helloservice.endpoint.HelloProxy;

public class Main {
  public static void main(String[] args) {
	HelloProxy p=new HelloProxy();
	//HelloWorldProxy hp=new HelloWorldProxy();
	try {
		System.out.println(p.sayHello("sai"));
		//System.out.println(hp.sayHelloWorld("yaswanth"));
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
