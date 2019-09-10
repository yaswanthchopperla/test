package com.hcl.intf;
interface Ione{
	void name();
}
interface Itwo{
	void email();
}
class Test implements Ione,Itwo{
	@Override
	public void email() {
		System.out.println("hcl@gmail.com");
	}
	@Override
	public void name() {
		System.out.println("HCL");
	}	
}
public class MultiIntf {
	public static void main(String[] args) {
		Test obj=new Test();
		obj.name();
		obj.email();
	}

}
