package com.cg.bean;

public class Department {
	private Integer departmentId;
	private String departmentName;
	private Integer managerId;
	private Employee employee;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(Integer departmentId, String departmentName, Integer managerId,Employee e) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
		this.employee=e;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	
	
}
