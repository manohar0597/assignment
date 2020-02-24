package com.cts.hash;

public class Registration {
	private String Name,Mail,Mobile;
	private double Cost;
	public Registration(String name, String mail, String mobile, double cost) {
		super();
		Name = name;
		Mail = mail;
		Mobile = mobile;
		Cost = cost;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((Mail == null) ? 0 : Mail.hashCode());
		result = prime * result + ((Mobile == null) ? 0 : Mobile.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		if (Double.doubleToLongBits(Cost) != Double.doubleToLongBits(other.Cost))
			return false;
		if (Mail == null) {
			if (other.Mail != null)
				return false;
		} else if (!Mail.equals(other.Mail))
			return false;
		if (Mobile == null) {
			if (other.Mobile != null)
				return false;
		} else if (!Mobile.equals(other.Mobile))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}
}
