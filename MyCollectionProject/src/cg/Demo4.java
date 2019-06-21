package cg;
import java.util.*;
import com.cg.bean.*;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Account>acc=new TreeMap<Integer,Account>();
		Account ob1=new Account(101,956087,"Punit",250000.00);
		acc.put(ob1.getMobile(),ob1);
		Account ob2=new Account(102,956084,"Sumit",50000.00);
		acc.put(ob2.getMobile(),ob2);
		Account ob3=new Account(105,956085,"Ariz",200000.00);
		acc.put(ob3.getMobile(),ob3);
		Account ob4=new Account(103,956086,"Sid",20000.00);
		acc.put(ob4.getMobile(),ob4);
		System.out.println(acc);
		System.out.println(acc.keySet());
		
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
		}

		
	}

}

