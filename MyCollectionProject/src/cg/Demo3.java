package cg;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String,Double> m=new HashMap<String,Double>();
       m.put("Ram",5000.00);
       m.put("Shyam",7000.00);
       m.put("Abdul",9000.00);
       m.put("Ganesh",4000.00);
       m.put(null,5000.00);
       System.out.println(m);
       System.out.println(m.size());
       Set<String> keys=m.keySet();
       System.out.println(keys);
       for(String k:keys)
       {
    	   Double val=m.get(k);
    	   System.out.println(k+" has a balance of "+val);
       }
       System.out.println("==============================");
       System.out.println("Before balance="+m.get("Shyam"));
       Double val=m.get("Shyam");
       val=val-3000.00;
       m.put("Shyam",val);
       System.out.println("Shyam balance after is="+m.get("Shyam"));
       System.out.println("==============================");
       Collection<Double> vals=m.values();
       List<Double> vallist=new ArrayList<Double>(vals);
       Collections.sort(vallist);
       for(double d:vallist)
       {
    	   System.out.println(d);
       }
       
	}

}
