package com.hcl.exp;

public class Div {
	
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println(c);
		} 
		catch(ArithmeticException e){
			System.out.println("division is impossible");
		    }
		catch(NumberFormatException e){
			System.out.println("String cannot convert to int");
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("arguments are mandatory");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("program by HCL");
		}
	}
}