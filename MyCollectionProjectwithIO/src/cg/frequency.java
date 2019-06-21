package cg;
import java.util.*;
import java.awt.List;

public class frequency {
	public static void main(String args[]) {
		LinkedList<String> col=new LinkedList<String>();
		col.add("a");
		col.add("a");
		col.add("a");
		col.add("b");
		Set<String> col1=new LinkedHashSet<>(col);
		for(String i:col1)
		{
		System.out.println("frequency of "+i+" is "+Collections.frequency(col, i));
		}
		
		
	}
	

}
