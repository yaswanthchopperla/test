package com.hcl.saikumar;

import java.rmi.RemoteException;

public class MainApplication {
  public static void main(String[] args) {
	SaiKumarProxy saiKumarProxy=new SaiKumarProxy();
	String res=null;
	try {
		res=saiKumarProxy.getname();
		System.out.println(res);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
