package com.hcl.exp;
class C11{
	int a,b;
	public C11(){
		a=5;
		b=6;	
	}
	@Override
	public String toString() {
		return "C11 [a=" + a + ", b=" + b + "]";
	}
}
class C23 extends C11{
	public C23(int a,int b){
	}
}
public class Quiz2 {
	public static void main(String[] args) {
		C23 ob=new C23(3,56);
		System.out.println(ob);
	}

}
