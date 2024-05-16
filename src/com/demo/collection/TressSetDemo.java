package com.demo.collection;

import java.util.TreeSet;

public class TressSetDemo {

	public static void main(String[] args) 
	{
		 TreeSet t = new TreeSet();
		 //t.add("shivani");
		 //t.add("Bhople");
		 //t.add("hello");
		// t.add(null);NullPointerException
		 //t.add(new Integer(23));ClassCastException
		 t.add(null);
		 t.add("a");//NullPointerException
		 
	     System.out.println(t);	 

	}

}
