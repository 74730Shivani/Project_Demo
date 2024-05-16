package cdac;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		 HashSet s = new HashSet();
		 s.add("SHivani");
		 s.add(23);
		 s.add(null);
		 s.add('a');
		 s.add("shivani");
		 System.out.println(s.add(23));
		 System.out.println(s);
		 
	}

}
