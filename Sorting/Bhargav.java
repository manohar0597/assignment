package com.cts.Sorting;

public class Bhargav implements Comparable<Bhargav>{
	int number;
	String name;
	Bhargav(int number,String name){
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[number=" + number + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Bhargav o) {
		return o.number - this.number;
	}
}
