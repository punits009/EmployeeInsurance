package com.cg.service;
import com.cg.bean.*;

public interface Transaction {
	public String calculateScheme(Employee e);
	public default void display(Employee e)
	{
		System.out.println("==========================");
		System.out.println("Employee id= "+e.getEid()+" Name= "+e.getEname());
		System.out.println("Salary is= "+e.getSalary()+" designation is= "+e.getDesignation());
		System.out.println("Scheme is="+e.getSceheme());
		
	}

}