package Arr;

import java.util.Scanner;
import java.util.*;
public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
    	System.out.println("enter the array");
		String st=in.next();
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
			System.out.println("frequency of "+a+" is "+Collections.frequency(l,a));
		}

	}

}
