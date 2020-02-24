package com.cts.Sorting;

public class Hall {
	private String Name;
	private double costPerDay;
	private int Capacity;
	 Hall(String name, double costPerDay, int capacity) {
		
		Name = name;
		this.costPerDay = costPerDay;
		Capacity = capacity;
	}
	public String getName() {
		return Name;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public int getCapacity() {
		return Capacity;
	}
	
	
}
