package com.cg.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.cg.bean.Department;
import com.cg.bean.Employee;
import com.cg.dao.EmployeeRepository;

public class EmployeeService implements EmployeeServiceInterface{

	EmployeeRepository empRepo = new EmployeeRepository();
	
	Map<Integer, List<Integer>> departEmpLink = new HashMap<>(); 
	
	public void addEmp(Employee emp) {
		Integer depart=null;
		if(emp.getDepartment() == null && departEmpLink.get(null)==null) {
			departEmpLink.put(null, new ArrayList<Integer>());
		}else {
			depart = emp.getDepartment().getDepartmentId();
			if(!departEmpLink.containsKey(depart)) {
				departEmpLink.put(depart, new ArrayList<Integer>());
				empRepo.addDepartment(emp.getDepartment());
			}
		}
		departEmpLink.get(depart).add(emp.getEmployeeId());
		
		empRepo.addEmplyee(emp);
	}
	
	
	public void addDepart(Department depart) {
		empRepo.addDepartment(depart);
	}
	
	@Override
	public double getSalarySum() {
		try {
			double result = 0.0;
			List<Employee> list = new ArrayList<>(empRepo.getAllEmployee());
			result = list.stream().mapToDouble(emp->emp.getSalary()).sum();
			return result;
		}catch(NullPointerException e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	@Override
	public List<String> getDepartAndEmpCount() {
		return empRepo.getAllDepartment().stream().map(depart->{
			List<Integer> emp_id= departEmpLink.get(depart.getDepartmentId());
			return depart.getDepartmentName() + " has Employees : "+emp_id.stream().count();
		}).collect(Collectors.toList());
	}

	@Override
	public Employee getSeniorEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeDuration(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesWithoutDepartment() {
		return empRepo.getAllEmployee().stream().filter((emp->emp.getDepartment() == null)).collect(Collectors.toList());
	}

	@Override
	public List<Department> getDepartmentWithoutEmployee() {
		
		// TODO Auto-generated method stub
		return empRepo.getAllDepartment().stream().filter((dept->dept.getEmployee()==null)).collect(Collectors.toList());
		
		
	}

	@Override
	public List<String> getHireDateDetails(Integer empId) {
		// TODO Auto-generated method stub

		Collection<Employee> emp=empRepo.getAllEmployee();
		List<Employee> empl=new ArrayList<>(emp);
		List<String> res=new ArrayList<>();
		for(Employee e:empl)
		{
			System.out.println(e);
			String re="";
			String name=e.getFirstName()+e.getLastName();
			System.out.println(name);
			re=re+name;
			LocalDate d=e.getHireDate();
			re=re+d;
			System.out.println(d);
			Calendar ca=Calendar.getInstance();
			ca.set(d.getYear(), d.getMonthValue(), d.getDayOfMonth());
			re=re+ca.get(Calendar.DAY_OF_WEEK);
            res.add(re);
		}
		return res;
		/*LocalDate d = LocalDate.now();
		Calendar ca = Calendar.getInstance();
		ca.set(year, month, date);
		ca.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(d.dayof);*/
	}

	@Override
	public Collection<Employee> getEmpByDayOfWeak(String day_of_weak) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<String> getEmpAndManagerNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmpSalaryAndSalaryIncrease(Integer empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employee> getEmployeesWithoutManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employee> getEmployeeUnderManager(String firstname, String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employee> sortByEmpId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employee> sortByDepartId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employee> sortByFirstname() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
