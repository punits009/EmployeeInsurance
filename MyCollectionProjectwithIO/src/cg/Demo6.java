package cg;
import java.util.*;
import com.cg.bean.*;
import java.io.*;
import com.cg.service.*;
public class Demo6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Long,Account>acc=new TreeMap<Long,Account>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true)
		{
		System.out.println("Menu ");
		System.out.println("======");
		System.out.println("1 Create Account");
		System.out.println("2 Print all acccount");
		System.out.println("3 exit");
		System.out.println("======");
		System.out.println("Enter your choice");
		choice=br.readLine();
		
		switch(choice)
		{
		  case "1":int id=0;
		           long mb=0L;
		           String ah="";
		           double bal=0.0;
		           //Accepting and validtaiing I/p for account number
		           System.out.println("Account Number");
		           while(true)
		           {
		        	String s_id=br.readLine();
		        	boolean ch1=Validator.validatedata(s_id, Validator.aidpattern);
		        	if(ch1==true)
		        	{
		        		try
		        		{
		        			id=Integer.parseInt(s_id);
		        			break;
		        		}
		        		catch(NumberFormatException e)
		        		{
		        			System.out.println("Account Number must be Numeric. ReEnter");
		        		}
		        	}
		        	else
		        	{
		        		System.out.println("ReEnter Account Number in 3 digits");
		        	}
		           }//end of account number while
		           
		           System.out.println("Mobile Number");
		           while(true)
		           {
		        	String s_mb=br.readLine();
		        	boolean ch1=Validator.validatedata(s_mb, Validator.mobpattern);
		        	if(ch1==true)
		        	{
		        		try
		        		{
		        			mb=Long.parseLong(s_mb);
		        			break;
		        		}
		        		catch(NumberFormatException e)
		        		{
		        			System.out.println("Mobile Number must be Numeric. ReEnter");
		        		}
		        	}
		        	else
		        	{
		        		System.out.println("ReEnter Mobile Number in 10 digits");
		        	}
		           }//end of account number while
		           
		           System.out.println("Account holder name");
		           while(true)
		           {
		        	String s_ah=br.readLine();
		        	boolean ch1=Validator.validatedata(s_ah, Validator.accpattern);
		        	if(ch1==true)
		        	{
		        		try
		        		{
		        			ah=s_ah;;
		        			break;
		        		}
		        		catch(NumberFormatException e)
		        		{
		        			System.out.println("name must be string. ReEnter");
		        		}
		        	}
		        	else
		        	{
		        		System.out.println("ReEnter name in");
		        	}
		           }//end of account number while
		           
		           System.out.println("Balance");
		           while(true)
		           {
		           bal=Double.parseDouble(br.readLine());
		           if(bal>0)
		           {
		           Account ob=new Account(id,mb,ah,bal);
		           acc.put(ob.getMobile(), ob);
		           break;
		           }
		           else
		           {
		        	   System.out.println("Balance can't ne less than zero ");
		        	   System.out.println("ReEnter the balance");
		           }
		           }
			       break;
		  case "2":Collection<Account> vc=acc.values();
		           List<Account> acclist=new ArrayList<Account>(vc);
		           Collections.sort(acclist);
		           for(Account o:acclist)
		           {
		        	   System.out.println(o);
		           }
			       break;
		  case "3":System.out.println("exiting Program");
			       System.exit(0);
			       break;
		  default: System.out.println("Invalid choice");
		}
		
		}//end of menu
		
		
		
		
		/*
		Collection<Account> vals=acc.values();
		List<Account> vallist=new ArrayList<Account>(vals);
		System.out.println("============================");
		Collections.sort(vallist,new SortbyName());
		for(Account o:vallist)
		{
			System.out.println(o);
		}
		Comparator cb=new SortbyBalance();
		System.out.println("============================");
		Collections.sort(vallist,cb);
		for(Account o:vallist)
		{
			System.out.println(o);
		}
		System.out.println("============================");
		Collections.sort(vallist,new Sortbyaid());
		for(Account o:vallist)
		{
			System.out.println(o);
		}*/

		
	}

}

