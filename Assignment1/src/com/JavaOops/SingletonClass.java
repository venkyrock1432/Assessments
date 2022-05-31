package com.JavaOops;
class Example{
	static Example exp = new Example();
	private Example() {
	}
	public static Example getExample() {
		System.out.println("Creative a Object Using SingleTone Class");
		return exp;
		
	}
	
}
public class SingletonClass {
	

	public static void main(String[] args) {
		Example A = Example.getExample();
		System.out.println(A);
		Example B = Example.getExample();
		System.out.println(B);
		

	}

}
