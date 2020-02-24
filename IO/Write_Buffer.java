package com.cts.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Buffer {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("D:Test.txt",true);
			BufferedWriter bf = new BufferedWriter(writer);
			bf.write("Fuck off");
			bf.newLine();
			bf.write("CTS");
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
