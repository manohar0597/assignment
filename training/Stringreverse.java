package com.cts.training;

import java.util.*;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		for(int i = 1; i < str.length(); i+=2)
			str.insert(i,"-");
		System.out.println(str);
		
	}


}
