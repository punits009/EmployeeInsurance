package cg;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		// Non generic collection
		Set col=new HashSet();
		col.add(55);
		col.add("Ram");
		col.add("Shyam");
		col.add('a');
		col.add(23.50);
		col.add(null);
		col.add("Ram");
		Iterator i=col.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(col.size());

	}

}
