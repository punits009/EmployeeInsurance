package cg;
import java.sql.*;
public class Demo1 {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		//Load driver
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="hr";
		String pass="hr";
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connected");
		Statement st=con.createStatement();
		ResultSet re=st.executeQuery("select * from account");
		while(re.next())
		{
			int a_id=re.getInt("aid");
			long mobile=re.getLong("mobileno");
			String ah=re.getString(3);
			double bal=re.getDouble(4);
			System.out.println("Account id="+a_id+" mobile= "+mobile+" accountholder= "+ah+" baalace= "+bal);
			System.out.println("====================");
		}
		/*int r=st.executeUpdate("update account set balance=100000 where aid=101");
		System.out.println(r+" entry updated");
		r=st.executeUpdate("insert into account values(104,9560837123,'Ariz',50000.00)");
		System.out.println(r+" records added");*/
      con.close();
	}

}
