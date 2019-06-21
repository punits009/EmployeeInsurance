package cg;
import com.cg.bean.*;
import java.util.*;
public class SortbyBalance implements Comparator<Account> {
	public int compare(Account a,Account b)
	{
		double diff=a.getBalance()-b.getBalance();
		if(diff>0)
		return 1;
		else if(diff<0)
			return -1;
		else
			return 0;
	}

}
