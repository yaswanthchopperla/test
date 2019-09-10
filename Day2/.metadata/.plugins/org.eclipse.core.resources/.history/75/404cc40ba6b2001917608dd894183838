package com.hcl.boxing;

public class timeZone {
	int hrs,min;
	public timeZone() {	
		
	}
	public timeZone(int hrs, int min) {
		super();
		this.hrs = hrs;
		this.min = min;
	}
	public timeZone add(timeZone t1,timeZone t2){
		timeZone t3=new timeZone();
		t3.hrs=t1.hrs+t2.hrs;
		t3.min=t1.min+t2.min;
		if(t3.min>=60){
			t3.hrs++;
			t3.min=t3.min%60;
			}
		return t3;	
	}
	@Override
	public String toString() {
		return "timeZone [hrs=" + hrs + ", min=" + min + "]";
	}
	public static void main(String[] args) {
		timeZone t1=new timeZone(3,40);
		timeZone t2=new timeZone(4,40);
		timeZone t3=new timeZone().add(t1, t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		}

}
