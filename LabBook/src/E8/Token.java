package E8;
import java.util.*;

public class Token {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the string");
		String st=in.nextLine();
		StringTokenizer s=new StringTokenizer(st," ");
		int sum=0;
		while(s.hasMoreElements())
		{
			sum=sum+Integer.parseInt(s.nextToken());
		}
		System.out.println(sum);
		
	}

}
