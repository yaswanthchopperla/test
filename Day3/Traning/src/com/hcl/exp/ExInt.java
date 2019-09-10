package com.hcl.exp;
class First{
	public void show(){
		System.out.println("show first method");
	}
}
class Second extends First{
	public void show(){
		System.out.println("show second method");
	}
}
public class ExInt {
	public static void main(String[] args) {
   First ob1=new First();
   try {
	Second ob2=(Second)ob1;
	   ob2.show();
}catch(ClassCastException e){
	System.out.println("casting is not possible");
}
   catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
