package cg;
import com.cg.bean.*;
import java.util.*;
public class SortbyName implements Comparator<Account> {
	public int compare(Account a,Account b)
	{
		String a1=a.getAccountholder();
		String b1=b.getAccountholder();
		int a2=a1.compareTo(b1);
		return a2;
				
	}

}
