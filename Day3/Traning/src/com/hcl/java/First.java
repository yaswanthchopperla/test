package com.hcl.java;
class One{
	public void show(){
		System.out.println("show method from first class");
	}
}
class Two extends One{
	public void show(){
		super.show();
		System.out.println("show method from second class");
	}
}
public class First {
	public static void main(String[] args) {
//		Two obj=new Two();
//		obj.show();
//		One obj1=new Two();
//		obj1.show();
//		We cannot write like this
//		Two obj2=new One();
//		obj1.show();
		One ob1=new One();
		Two obj2=new Two();
		One f1=(One)obj2;//object of two class casted to one class
		f1.show();
		Two f2=(Two)obj2;//object of two class casted to same class
		f2.show();
		//base class object cannot be casted by derived class
	}

}
