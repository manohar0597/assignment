package com.cts.IO;

import java.io.*;

public class UTF {
	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("D:Test.txt");
			InputStreamReader reader = new InputStreamReader(input,"UTF-8");
			
			int ch;
			
			while((ch = reader.read()) != -1){
				System.out.print((char)ch);
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
