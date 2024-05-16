package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialazation extends MyClass {

	public static void main(String[] args)
	{
		 MyClass ob = new MyClass();
		try {
			FileOutputStream fos = new FileOutputStream("Test.txt");
			try {
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(ob);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("Test.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			MyClass o =(MyClass)ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(o.i+"  "+o.j);
		
        
	}

}
