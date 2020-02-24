package com.cts.training;

import java.util.*;

public class Returnelements {
	public  static void main(ArrayList<Integer> list1,ArrayList<Integer> list2){
		list1.addAll(list2);
		Collections.sort(list1);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(list1.get(2));
		list3.add(list1.get(6));
		list3.add(list1.get(8));
		
		System.out.println(list3);
	}

	public static void main(String[] args) {
		System.out.println("Enter how many number you want");
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		System.out.println("Enter elements");
		for(int i=0; i< 5; i++){
			System.out.println("Enter " + i + " element");
			list1.add(sc.nextInt());
		}
		System.out.println("Enter elements");
		for(int i=0; i< 5; i++){
			System.out.println("Enter " + i + " element");
			list2.add(sc.nextInt());
		}
		
	}

}
