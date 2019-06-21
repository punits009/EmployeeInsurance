import java.util.*;

public class E1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number till you want the sum to calculate");
		int n=sc.nextInt();
		int sum=calsum(n);
		int d=caldif(n);
		boolean b=inc(n);
		boolean c=power(n);
		System.out.println("sumof natural number divisible by 3 and 5 is= "+sum);
		System.out.println("difference bw sum of square and square of sum is = "+d);
		if(b)
		System.out.println("The number= "+n+" is increasing");
		else
			System.out.println("The number= "+n+" is not increasing");
        if(c)
        	System.out.println("Number is power of 2");
        else
        	System.out.println("Number is not power of 2");
	}
	public static int calsum(int n)//finds sum of natural number divisible by 3 and 5
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
						}
		}
		return sum;
	}
	public static int caldif(int n)//find difference bw sum of square and square of sum
	{
		int sosq=(n*(n+1)*(2*n+1))/6;
		int sqos=((n*(n+1))/2)*((n*(n+1))/2);
		return Math.abs(sosq-sqos);
	}
	
	public static boolean inc(int n)//finds if number is increasing
	{
		String st=Integer.toString(n);
		boolean b=false;
		char c[]=st.toCharArray();
		Arrays.sort(c);
		String s=String.valueOf(c);
		if(st.equals(s))
			b=true;
		else
			b=false;
		return b;
	}
	public static boolean power(int n)
	{
		int rem=0;
		while(n>2)
		{
		    rem=n%2;
			n=n/2;
		}
		if(rem==0)
		{
			return true;
		}
		else
			return false;
	}

}
