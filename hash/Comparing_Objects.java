package com.cts.hash;

import java.util.Scanner;

public class Comparing_Objects {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String Name,Mail,Mobile;
		double cost;
		System.out.println("Enter the data");
		Name = sc.next();
		Mail = sc.next();
		Mobile = sc.next();
		cost = sc.nextDouble();
		
		Registration register1 = new Registration(Name,Mail,Mobile,cost);
		
		System.out.println("Enter the data");
		Name = sc.next();
		Mail = sc.next();
		Mobile = sc.next();
		cost = sc.nextDouble();
		
		Registration register2 = new Registration(Name,Mail,Mobile,cost);
		
		if(register1.equals(register2))
			System.out.println("Both same");
		else
			System.out.println("Both not same");
	}

}
