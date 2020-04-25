package com.forgyan.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int age;
	public String name;
	static String fileName = "file.ser";
	
	public SerializationDemo(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args) {
		SerializationDemo obj = new SerializationDemo(29, "Suraj Mahli");
		serialize(obj);
		deSeralize();
	}
	
	public static void serialize(SerializationDemo obj) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(obj);
			out.close();
			file.close();
			System.out.println("Serialization completed");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void deSeralize() {
		try {
			SerializationDemo object2 = null;
			
			FileInputStream input = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(input);
			
			object2 = (SerializationDemo) in.readObject();
			
			in.close();
			input.close();
			
			System.out.println("Deserialization completed");
			
			System.out.println(object2.age);
			System.out.println(object2.name);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
