package com.hcl.inh;
class C1 {
	public void show()
	{
		System.out.println("hai");
	}
}
class C2 extends C1{
	public void show1(){
		System.out.println("bye");
	}
}
public class InhDemo {

	public static void main(String[] args) {
		C2 obj=new C2();
		obj.show1();
		obj.show();
	}
}

