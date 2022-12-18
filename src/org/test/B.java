package org.test;

public class B {

	public static void main(String[] args) {
		int a=10;int b =20;
		
		A ab = new A();
		System.out.println(ab.add(a,b));
		if (ab.add(a,b)==50)
		{
			System.out.println("valid");
			
		}
		else
		{
			System.out.println("invalid");
		}
		
	}

}
class A {
	public int add(int a , int b)
	{
		return a + b;
	}
}