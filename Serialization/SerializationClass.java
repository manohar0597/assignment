package com.cts.Serialization;

import java.io.*;

public class SerializationClass {
	
	static void Serialize(Laptop laptop){
		try{
		FileOutputStream out = new FileOutputStream("D:serial.txt");
		ObjectOutputStream obj = new ObjectOutputStream(out);
		obj.writeObject(laptop);
		obj.close();
		}catch(IOException e){e.printStackTrace();}
	}
	static Laptop deserialize(){
		Laptop l = null;
		try {
			FileInputStream in = new FileInputStream("D:serial.txt");
			ObjectInputStream obj = new ObjectInputStream(in);
			l = (Laptop)obj.readObject();
			obj.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;
	}
	
	public static void main(String[] args) throws IOException {
		
		Laptop laptop = new Laptop("Dell","Inspiron 3558","i5","Bhargav");
		
		SerializationClass.Serialize(laptop);
		System.out.println(laptop);
		
		System.out.println(SerializationClass.deserialize());
		
		
	}
}
