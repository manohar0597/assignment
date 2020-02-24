package com.cts.training;

import java.util.Scanner;

public class UserMainCode {
	public static void formNewWord(String s,int num){
		StringBuilder st = new StringBuilder(s);
		st.reverse();
		String s1 = "",s2 = "";
		int i = 0;
		while(i < num){
			s1 += s.charAt(i);
			s2 += st.charAt(i);
			i++;
		}
		if((s1+new StringBuilder(s2).reverse()).equals(s))
			System.out.println("No New string created");
		else
			System.out.println(s1+new StringBuilder(s2).reverse());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		System.out.println("Enter the positive integer");
		int num = sc.nextInt();
		if(num > 0)
			UserMainCode.formNewWord(s,num);
		else
			System.out.println("You entered negitavie number");
	}

}