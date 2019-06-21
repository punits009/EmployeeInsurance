package cg;
import java.sql.*;
import java.util.*;
public class Demo4 {

	public static void main(String[] args) throws SQLException{
		//LOad the Driver
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String pass="hr";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			con.setAutoCommit(false);//not to commit after every dml statement
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter mobile no");
			long mob=sc.nextLong();
			System.out.println("enter account holder");
			String ah=sc.next();
			System.out.println("enter balance");
			double bal=sc.nextDouble();
			
			String sqlQuery="insert into account values(?,?,?,?)";
			PreparedStatement st=con.prepareStatement(sqlQuery);
			st.setInt(1, id);
			st.setLong(2, mob);
			st.setString(3, ah);
			st.setDouble(4, bal);
			int i=st.executeUpdate();
			System.out.println("inserted records="+i);
			con.commit();
			con.close();
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage()+" "+e.getErrorCode()+" "+e.getSQLState());
			e.printStackTrace();
		}

}
}
