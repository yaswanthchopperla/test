package com.hcl.boxing;

public class Overload {
	    public void show(int x){
		    System.out.println("show method w.r.t to int" +x);
		}
		public void show(String x){
			System.out.println("show method w.r.t to String" +x);
		}
		public void show(double x){
			System.out.println("show method w.r.t to double" +x);
	    }
			public void show(boolean  x){
				System.out.println("show method w.r.t to boolean" +x);
		}
		public static void main(String[] args) {
			Overload obj=new Overload();
			obj.show(12);
			obj.show("hcl");
			obj.show(12.8);
			obj.show(true);
				
				
			}
					
	}
      


