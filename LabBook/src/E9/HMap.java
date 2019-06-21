package E9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HMap {
	public static void main(String args[])
	{
		Map<Integer, String> book=new TreeMap<Integer,String>();
		book.put(1,"Math");
		book.put(2,"English");
		book.put(3,"Science");
	    List<String> l=new ArrayList<String>(book.values());
	    Collections.sort(l);
	    System.out.println(l);
		
		
	}

}
