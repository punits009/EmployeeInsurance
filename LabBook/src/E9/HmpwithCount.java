package E9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HmpwithCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer > book=new TreeMap<Character,Integer>();
		Scanner in=new Scanner(System.in);
    	System.out.println("enter the array");
		String st=in.nextLine();
		char ch[]=st.toCharArray();
		List<Character> l=new ArrayList<Character>();
		Set<Character> s=new TreeSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			l.add(ch[i]);
			s.add(ch[i]);
		}
		for(Character a:s)
		{
			book.put(a,Collections.frequency(l, a));
		}
        System.out.println(book);

	}

}
