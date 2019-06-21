package E4;
import java.math.BigInteger;
import java.util.*;
public class P1 {
	static int a=1,b=1,c=0;
	
public  static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("1 for green 2 for yellow 3 for red");
	String c=in.next();
	switch(c)
	{
	case "1":System.out.println("GO");
	         break;
	case "2":System.out.println("READY");
	         break;
	case "3":System.out.println("STOP");
             break;
	}
	System.out.println("enter the number of terms");
	int n=in.nextInt();
	
	feb(n);
	System.out.println("enter the number upto which you want prime numbers");
	n=in.nextInt();
	for(int i=2;i<=n;i++)
	{
		BigInteger b=BigInteger.valueOf(i);
		if(b.isProbablePrime(1000))
		{
			System.out.println(i);
		}
	}
	
}


public static void feb(int n)
{ int a=1,b=1;int c=0;
System.out.println("non recursive=================");
     for(int i=1;i<=n;i++)
     {
    	 if(i==1 ||i==2)
    	 System.out.println(a);
    	 else {
    		 c=a+b;
    		 System.out.println(c);
    		 a=b;b=c;
    	 }
     }
}
}
