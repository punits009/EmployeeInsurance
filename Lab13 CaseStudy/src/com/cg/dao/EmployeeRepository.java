package com.cg.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Department;
import com.cg.bean.Employee;

public class EmployeeRepository implements EmpRepositoryInterface{
	Map<Integer, Employee> empList = new HashMap<>();
	Map<Integer, Department> departList = new HashMap<>();
	@Override
	public boolean addEmplyee(Employee emp) {
		empList.put(emp.getEmployeeId(), emp);
		return false;
	}
	@Override
	public boolean removeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Department findEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection<Employee> getAllEmployee() {
		return empList.values();
	}
	@Override
	public boolean addDepartment(Department d) {
		departList.put(d.getDepartmentId(), d);
		return true;
	}
	@Override
	public boolean removeDepartment(Department d) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Department findDepartment(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection<Department> getAllDepartment() {
		return departList.values();
	}
	
}
