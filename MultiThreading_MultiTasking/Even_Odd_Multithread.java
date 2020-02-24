package com.cts.MultiThreading_MultiTasking;

import java.util.*;

public class Even_Odd_Multithread extends Thread{
	public void run(){
		Scanner sc = new Scanner(System.in); 
		String st = Thread.currentThread().getName();
		int number;
		if(st.equals("Even")){
			System.out.println("Enter a number to print even numbers");
			number = sc.nextInt();
			for(int i=0; i <= number; i+=2){
				System.out.println("Even " + i);
			}
		}
		else{
			System.out.println("Enter a number to print odd numbers");
			number = sc.nextInt();
			for(int i=1; i <= number; i+=2){
				System.out.println("Odd " + i);
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even_Odd_Multithread even = new Even_Odd_Multithread();
		Even_Odd_Multithread odd = new Even_Odd_Multithread();
		
		even.start();
		even.setName("Even");
		
		odd.start();
		odd.setName("Odd");
	}

}

