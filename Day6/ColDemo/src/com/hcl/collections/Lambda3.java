package com.hcl.collections;
@FunctionalInterface
interface ICtoF{
	double calc(double c);
}
public class Lambda3 {
	public static void main(String[] args) {
		ICtoF res=(c)->{
			double f=((9*c)/5)+32;
		return f;
		};
		ICtoF res1=(c)->{
			double k=c+273;
			return k;
		};
		System.out.println(res.calc(36));
		System.out.println(res1.calc(37));
	}
}
