package com.hcl.lambda;

public class WithLambdaExp {
    public static void main(String[] args) {
		MyInterface my=()->{System.out.println("welcome to lambdaExp");};
		my.sayMessage();
	}
}
