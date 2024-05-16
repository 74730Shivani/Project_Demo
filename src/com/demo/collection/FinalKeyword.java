package com.demo.collection;

public class FinalKeyword {

	public static void main(String[] args) 
	{
		 //if use final keyword with variable then we can not reinitialized that variable..
		int a =10;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		final int b =10;
		System.out.println(b);
		//b++;
		
	}

}
