package com.cg.pl;
import java.util.HashMap;
import java.io.*;
import java.util.Map;
import com.cg.bean.*;
import com.cg.service.*;
import java.util.*;
public class MyEmployee {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeService();
	    Map<Integer,Employee> acc=new TreeMap<Integer,Employee>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true)
		{
		System.out.println("Menu");
		System.out.println("======================");
		System.out.println("1 for creating employee and getting details from user");
		System.out.println("2 for calculating scheme");
		System.out.println("3 for display");
		System.out.println("4 for exit");
		choice=br.readLine();
		switch(choice)
		{
		case "1":int eid=0;String ename=""; double salary=0.0; String designation="";
			     System.out.println("employee id");
			     while(true)
			     {
			    	 String s_id=br.readLine();
			    	 boolean c=Validator.validate(s_id, Validator.idpattern);
			    	 if(c==true)
			    	 {
			    		 try {
			    		 eid=Integer.parseInt(s_id);
			    		 break;
			    	          }
			    		 catch(NumberFormatException e)
			    		 {
			    			 System.out.println("Enter employee number in numeric");
			    		 }
			         }
			    	 else
			    	 {
			    		 System.out.println("Enter id in 3 digits");
			    	 }
		         }//end of employee id while
		         
			     System.out.println("employee name");
			     while(true)
			     {
			    	 String s_na=br.readLine();
			    	 boolean c=Validator.validate(s_na, Validator.namepattern);
			    	 if(c==true)
			    	 {
			    		 try {
			    		 ename=s_na;
			    		 break;
			    	          }
			    		 catch(NumberFormatException e)
			    		 {
			    			 System.out.println("Enter employee number in alphabetical order");
			    		 }
			         }
			    	 else
			    	 {
			    		 System.out.println("Enter name in correct format");
			    	 }
		         }//end of employee name while
		         
			     System.out.println("employee designation");
			     while(true)
			     {
			    	 String s_d=br.readLine();
			    	 boolean c=Validator.validate(s_d, Validator.despattern);
			    	 if(c==true)
			    	 {
			    		 try {
			    		 designation=s_d;
			    		 break;
			    	          }
			    		 catch(NumberFormatException e)
			    		 {
			    			 System.out.println("Enter employee designation in alphabets");
			    		 }
			         }
			    	 else
			    	 {
			    		 System.out.println("Enter designation again");
			    	 }
		         }//end of employee id while
			     System.out.println("employee salary");
			     while(true)
			     {
			    	 String s_sa=br.readLine();
			    	 boolean c=Validator.validate(s_sa, Validator.salpattern);
			    	 
			    	 if(c==true)
			    	 {
			    		 try {
			    		 salary=Double.parseDouble(s_sa);
			    		 break;
			    	          }
			    		 catch(NumberFormatException e)
			    		 {
			    			 System.out.println("Enter employee salary in numeric");
			    		 }
			         }
			    	 else
			    	 {
			    		 System.out.println("Enter salary again ");
			    	 }
			    	 
			    	 if(salary<0)
			    	   {
			    		 System.out.println("Enter the salary greater than zero ");
			    		 break;
			    	 }
			    	 
		         }//end of employee id while
			     Employee ob=new Employee(eid,ename,salary,designation);
	    		 acc.put(ob.getEid(),ob);
			     System.out.println("Employee added");
		        break;
		      
		case "2":System.out.println("enter employee id ");
		         eid=Integer.parseInt(br.readLine());
		         System.out.println(service.calculateScheme(acc.get(eid)));
		         break;
		      
		case "3":System.out.println("The details for employees are");
		         System.out.println("=============================");
		         Collection<Employee> vc=acc.values();
		         List<Employee> acclist=new ArrayList<Employee>(vc);
		         for(Employee o:acclist)
		         {
		        	 service.display(o);
		         }
		         break;
		         
		case "4":System.out.println("System exiting");
		         System.exit(0);
		         break;
		         
		default:System.out.println("wrong choice");
		}
		}
	}
}