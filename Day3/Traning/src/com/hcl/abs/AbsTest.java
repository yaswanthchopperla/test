package com.hcl.abs;
abstract class Animal{
	abstract void name();
	abstract void type();
}
class Tiger extends Animal{

	@Override
	void name() {	
		System.out.println("name is tiger");	
	}
	@Override
	void type() {
		System.out.println("type is: wild");
	}
}
class Lion extends Animal{

	@Override
	void name() {
		System.out.println("name is lion");
	
	}
	@Override
	void type() {
		System.out.println("type is: wild");
		
	}	
}
public class AbsTest {
	public static void main(String[] args) {
		Animal[] arr=new Animal[]{
				new Tiger(),new Lion()};
		for (Animal animal : arr) {
			animal.name();
			animal.type();	
		}
	}
}
