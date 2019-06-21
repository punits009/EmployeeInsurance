package cg;
import com.cg.bean.*;
import java.util.*;
public class Sortbyaid implements Comparator<Account> {
	public int compare(Account a,Account b)
	{
		return a.getAid()-b.getAid();
	}

}
