package com.cts.IO;

import java.util.*;
import java.io.*;

public class TestReader {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("D:Test.txt");
			BufferedReader bf = new BufferedReader(fr);
//			int c;
			String s; 
			/*while ((c = fr.read()) != -1){
				System.out.print((char)c);
			}*/
			while((s = bf.readLine()) != null){
				System.out.println(s);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
