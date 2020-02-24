package com.cts.Sorting;

import java.util.*;

public class Comparable_Class {

	public static void main(String[] args) {
		
		LinkedList<Bhargav> list = new LinkedList<Bhargav>();
		list.add(new Bhargav(15,"school"));
		list.add(new Bhargav(17,"Inter"));
		list.add(new Bhargav(20,"B.Tech"));
		list.add(new Bhargav(21,"Office"));
		Collections.sort(list);
		for(Bhargav b : list)
			System.out.println(b);
	}

}




