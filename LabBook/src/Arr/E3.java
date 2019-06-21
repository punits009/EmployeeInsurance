package Arr;
import java.util.*;

public class E3 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter values in array");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		secondsmall(a);
		halfsort();
		reversesort();
	}
	public static void secondsmall(int a[])
	{
		Arrays.sort(a);
		System.out.println("second smallest numbere is= "+a[1]);
	}
    public static void halfsort()
    {
    	Scanner in=new Scanner(System.in);
    	System.out.println("enter the size of array");
		int n=in.nextInt();
		String a[]=new String[n];
		System.out.println("enter values in array");
		for(int i=0;i<n;i++)
		{
			a[i]=in.next();
		}
		Arrays.sort(a);
		for(int i=0;i<n/2;i++)
		{
			a[i]=a[i].toUpperCase();
			
		}
		for(int i=n/2;i<n;i++)
		{
			a[i]=a[i].toLowerCase();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
    }
    public static void reversesort()
    {
    	Scanner in=new Scanner(System.in);
    	System.out.println("enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter values in array");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			StringBuilder sb=new StringBuilder(Integer.toString(a[i]));
			sb.reverse();
			int b=Integer.parseInt(sb.toString());
			a[i]=b;
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
    }
}
