package com.cg.service;
import com.cg.bean.*;
import java.util.*;
public class EmployeeService implements Transaction{
Scanner in=new Scanner(System.in);
	
	@Override
	public String calculateScheme(Employee e) {
		// TODO Auto-generated method stub
		String scheme="";
		if(e.getSalary()>5000 && e.getSalary()<20000 && e.getDesignation().equals("System Associate"))
		{
			scheme="Scheme C";
		}
		else if(e.getSalary()>=20000 && e.getSalary()<40000 && e.getDesignation().equals("Programmer"))
		{
			scheme="Scheme B";
		}
		else if(e.getSalary()>=40000 && e.getDesignation().equals("Manager"))
		{
			scheme="Scheme A";
		}
		else
		{
			scheme="No Scheme";
		}
		e.setScheme(scheme);
		return scheme;
		
	}
	

}