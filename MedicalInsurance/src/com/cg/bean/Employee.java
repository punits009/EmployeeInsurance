package com.cg.bean;

public class Employee {
	private int Eid;
	private String Ename;
	private double salary;
	private String designation;
	private String scheme;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary, String designation) {
		super();
		this.Eid = eid;
		this.Ename = ename;
		this.salary = salary;
		this.designation = designation;
		
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSceheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", salary=" + salary + ", designation=" + designation
				+ " ]"+"scheme is="+scheme;
	}
	

}