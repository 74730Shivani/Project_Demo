package com.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializationDemo  
{

	public static void main(String[] args)throws Exception
	{
		Account a1 = new Account();
		System.out.println(a1.name+"...."+a1.pwd);
		FileOutputStream fos = new FileOutputStream("Test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("Test.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account)ois.readObject();
		System.out.println(a2.name+"..."+a2.pwd);
		
	}

}
