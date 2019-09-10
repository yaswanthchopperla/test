package com.hcl.boxing;

public class Employcheck {
	public Employ showEmploy(int empno){
		Employ employ=null;
		if(empno==1){
			employ=new Employ();
			employ.empno=100;
			employ.name="anubhav";
			employ.basic=445;
		}
		if(empno==3){
			employ=new Employ();
			employ.empno=109;
			employ.name="anubhav arh";
			employ.basic=446;
		}
		return employ;
	}
	public static void main(String[] args) {
		//System.out.println(new Employcheck().showEmploy(1));
		Employcheck obj=new Employcheck();
		Employ res=obj.showEmploy(8);
		if(res!=null){
			System.out.println(res);
		}else{
			System.out.println("not found");
		}
		
	}

}
