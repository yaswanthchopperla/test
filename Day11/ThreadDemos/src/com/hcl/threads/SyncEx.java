package com.hcl.threads;
class Data { 
	 synchronized void dispMsg(String name) { 
		System.out.print("Hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("How are u....");
	}
}
 class uttam extends Thread { 
	 Data d;
	 uttam(Data d){
		 this.d = d;
	 }
	 @Override
	public void run() {
		 d.dispMsg("Uttam");
	}
 }
 class laksh extends Thread {
	 Data d;
	 laksh(Data d){
		 this.d = d;
	 }
	 @Override
	public void run() { 
		 d.dispMsg("laksh");
	}
 }
 class hema extends Thread {
	 Data d;
	 hema(Data d){
		 this.d = d;
	 }
	 @Override
	public void run() { 
		 d.dispMsg("hema");
	}
 }
public class SyncEx {
    public static void main(String[] args) {
    	Data d = new Data(); 
		laksh obj1 = new laksh(d);
		hema obj2 = new hema(d);
		uttam obj3 = new uttam(d);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
