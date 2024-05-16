package com.demo.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		 //HashSet s = new HashSet();
		LinkedHashSet s = new LinkedHashSet();
		 s.add("SHivani");
		 s.add(23);
		 s.add(null);
		 s.add('a');
		 s.add("shivani");
		 System.out.println(s.add(23));
		 System.out.println(s);
		 
	}

}
