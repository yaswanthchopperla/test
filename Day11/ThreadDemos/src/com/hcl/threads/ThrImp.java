package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable {
	@Override
	public void run() {
      List lstData = new ArrayList();
      lstData.add("Keerthana");
      lstData.add("yash");
      lstData.add("Amit");
      lstData.add("Raghu");
      lstData.add("sai");
      lstData.add("Krishna");
      for (Object object : lstData) {
		System.out.println(object);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
class LinkDemo implements Runnable {
	@Override
	public void run() {
		LinkedList lst = new LinkedList();
		lst.add("Bindhu");
		lst.add("Visalakshi");
		lst.add("Anubhav");
		lst.add("Prem");
		lst.add("Rishab");
		lst.add("Janani");
		lst.add("Tarun");
		lst.add("Kiruba");
		for (Object object : lst) {
			System.out.println(object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class VectorDemo implements Runnable { 
	@Override
	public void run() {
       Vector v = new Vector(3,2);
       v.addElement("Nivedha");
       v.addElement("Yaswanth");
       v.addElement("Sai Krishna");
       v.addElement("Prem Reddy");
       v.addElement("Anisha");
       v.addElement("Nagendra");
       for (Object object : v) {
		System.out.println(object);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}       
	}
}
public class ThrImp {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ListDemo());
		Thread t2 = new Thread(new LinkDemo());
		Thread t3 = new Thread(new VectorDemo());
		 
		t1.start();
		t2.start();
		t3.start();
	}

}
