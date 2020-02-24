package com.cts.training;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp();
		acceptEmpDetails(emp);
		displayEmpDetails(emp);

	}

	private static void displayEmpDetails(Emp emp) {
		System.out.println(emp.getEmpId() + "  " + emp.getEmpName() );
		System.out.println(emp.getAddress().getAddress1() + "  " + emp.getAddress().getAddress1()+ "  " + emp.getAddress().getCity() + " " + emp.getAddress().getPincode() );
	}

	private static void acceptEmpDetails(Emp emp) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Employee Id");
		String empId = sc.nextLine();
		emp.setEmpId(empId);
		System.out.println("Enter Employee Name");
		String empName = sc.nextLine();
		emp.setEmpName(empName);
		Address ad = new Address();
		System.out.println("Enter Employee Address1");
		String address1 = sc.nextLine();
		ad.setAddress1(address1);
		System.out.println("Enter Employee Address2");
		String address2 = sc.nextLine();
		ad.setAddress2(address2);
		System.out.println("Enter Employee City");
		String city = sc.nextLine();
		ad.setCity(city);
		System.out.println("Enter Employee Pincode");
		int pincode = sc.nextInt();
		ad.setPincode(pincode);
		emp.setAddress(ad);
		
	}

}
