package com.hcl.project;

public class Student {
	private int sno;
	private String name;
	private String city;
	private double cgp;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCgp() {
		return cgp;
	}
	public void setCgp(double cgp) {
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	
}
