package com.cts.IO;

import java.io.*;

public class Writeclass {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("D:Test.txt",true);
			writer.write("Fuck Off");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
