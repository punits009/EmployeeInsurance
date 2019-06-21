package cg;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
	//Set <String>col=new HashSet<>();
	List <String>col=new ArrayList<>();	
	col.add("Ram");
	col.add("Shyam");
	col.add("Ram");
	Collections.sort(col,Collections.reverseOrder());
	Iterator<String> i=col.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println(col.size());

	}
}
