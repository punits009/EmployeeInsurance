package com.cg.service;

import java.util.List;
import com.cg.bean.Department;
import com.cg.bean.Employee;
import java.util.Collection;


public interface EmployeeServiceInterface {
	public double getSalarySum();
	public List<String> getDepartAndEmpCount();
	public Employee getSeniorEmployee();
	public Employee getEmployeeDuration(Integer empId);
	public List<Employee> getEmployeesWithoutDepartment();
	public List<Department> getDepartmentWithoutEmployee();
	public List<String> getHireDateDetails(Integer empId);
	public Collection<Employee> getEmpByDayOfWeak(String day_of_weak);
	public Collection<String> getEmpAndManagerNames();
	public String getEmpSalaryAndSalaryIncrease(Integer empid);
	public Collection<Employee> getEmployeesWithoutManager();
	public Collection<Employee> getEmployeeUnderManager(String firstname, String lastname);
	public Collection<Employee> sortByEmpId();
	public Collection<Employee> sortByDepartId();
	public Collection<Employee> sortByFirstname();
}
