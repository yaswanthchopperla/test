package com.hcl.collections;
@FunctionalInterface
interface IHello{
	void sayHello();
}
@FunctionalInterface
interface ICalc{
	int calc(int a,int b);
}
public class Lambda2 {
	public static void main(String[] args) {
		IHello h1= ()->{
			System.out.println("hello from rishab");
		};
		IHello h2= ()->{
			System.out.println("hello from lakshmi");
		};
		IHello h3=()->{
			System.out.println("hello from laksh");
		};
//		h1.sayHello();
//		h2.sayHello();
//		h3.sayHello();
//		ICalc ad=(a,b) ->{
//			System.out.println("sum");
//			return a+b;
//		};
		ICalc ad1=(a,b)->(a+b);
		ICalc ad2=(a,b)-> (a*b);
		System.out.println(ad1.calc(11, 5));
		System.out.println(ad2.calc(2,4));
	};
}
