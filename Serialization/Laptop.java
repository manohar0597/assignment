package com.cts.Serialization;

import java.io.Serializable;

public class Laptop implements Serializable{
	
	private String Company,Model,Proccessor;
	private transient String name;

	@Override
	public String toString() {
		return "Laptop [Company=" + Company + ", Model=" + Model + ", Proccessor=" + Proccessor + ", name=" + name
				+ "]";
	}

	public Laptop(String company, String model, String proccessor, String name) {
		super();
		Company = company;
		Model = model;
		Proccessor = proccessor;
		this.name = name;
	}
	
}
