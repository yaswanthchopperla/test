package com.hcl.exp;
class Employ{
	String name;
	public Employ(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Emplopy [name=" + name + "]";
	}
}
class HrEmploy extends Employ{
	public HrEmploy(String name){
		super(name);
		}
}
class JavaEmploy extends Employ{
	public JavaEmploy(String name){
		super(name);
		}
}
public class Quiz4 {
	public static void main(String[] args) {
		Employ[] arrEmploy=new Employ[]{
				new HrEmploy("sagar"),
				new JavaEmploy("niveditha"),
				new HrEmploy("samuel"),
				new JavaEmploy("veditha"),
				new HrEmploy("santhosh"),
				new JavaEmploy("haritha"),
				new HrEmploy("samba"),
				new JavaEmploy("nishitha")		
		};
		// also we can write like this
//		for (Employ employ : arrEmploy) {
//			if((employ.getClass().getSimpleName()).equals("JavaEmploy")){
//				System.out.println(employ);
//			}
//		}
		for (Employ employ : arrEmploy) {
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
			}
			
		}
		
	}

}
