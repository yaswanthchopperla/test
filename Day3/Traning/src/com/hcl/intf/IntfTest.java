package com.hcl.intf;
interface First{
	//defender methods
	default void name(){
		System.out.println("name from first");
	}
}
interface Second{
	default void name(){
		System.out.println("name from second");
	}
}
interface Third{
	default void name(){
		System.out.println("name from third");
	}
}
class Demo implements First,Second,Third{
	@Override
	public void name() {
		First.super.name();
		Second.super.name();
		Third.super.name();		
	}	
}
	public class IntfTest {
		public static void main(String[] args) {
			new Demo().name();
		}
}


