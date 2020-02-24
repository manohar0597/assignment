package com.cts.Exception;

import java.util.Scanner;

public class Class_Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Can u enter 10 digit mobile number");
		String st = sc.next();
		
			try {
				if(st.matches("[0-9]{10}"))
					System.out.println("Number is  " + st);
				else
					throw new HandleExceptionClass("Enter 10 digit mobile number");
			} catch (HandleExceptionClass e) {
				e.printStackTrace();
			}finally{
				sc.close();
			}
	}

}