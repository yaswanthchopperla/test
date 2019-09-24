package com.hcl.web;

import java.rmi.RemoteException;

public class MainApplication {
    public static void main(String[] args) {
		int result=0,result1=0;
		CaluculatorProxy caluculatorProxy = new CaluculatorProxy();
		try {
			result=caluculatorProxy.add(2, 7);
			result1=caluculatorProxy.mul(4, 7);
			System.out.println("Addition is :" +result);
			System.out.println("Multiplication is :"+result1);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
