package com.cts.collections;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the String");
		String st1 = sc.next();
		System.out.println("Enter the String");
		String st2 = sc.next();
		
		String arr1[] = st1.split("-");
		String arr2[] = st2.split("-");
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
		
		int i = 0, j = 0,flag = 0;
		
		while(i < list1.size() && j < list2.size()){
			if(list1.get(i).length() == list2.get(j).length()){
				flag = 1;
			}
			else{
				flag = 0;
				break;
			}
			i++;
			j++;
		}
		if(flag != 0)
			System.out.println("matched");
		else
			System.out.println("not matched");
		
//		System.out.println(list);
	}

}
