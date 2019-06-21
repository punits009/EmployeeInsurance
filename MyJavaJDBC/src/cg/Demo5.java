package cg;
import java.sql.*;
import java.util.*;
public class Demo5 {

	public static void main(String[] args) throws SQLException{
		//LOad the Driver
		Connection con=null;
		PreparedStatement updatest=null;
		PreparedStatement selectst=null;
		try
		{
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="hr";
			String pass="hr";
			con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			con.setAutoCommit(false);//not to commit after every dml statement
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			selectst=con.prepareStatement("select * from account where aid=?");
			selectst.setInt(1, id);
			ResultSet rs=selectst.executeQuery();
			double bal=0.0;
			long mb1=0L;
			String ah1="";
			if(rs!=null)
			{
				if(rs.next())
				{
					mb1=rs.getLong("mobileno");
					ah1=rs.getString("accountholder");
					System.out.println(ah1);
							
					
					bal=rs.getDouble("balance");
					System.out.println("your balance is="+bal);
				}
			}
			System.out.println("enter another id");
			int id1=sc.nextInt();
			long mb2=0L;
			String ah2="";
			selectst.setInt(1, id1);
			ResultSet rs2=selectst.executeQuery();
			double b=0.0;
			if(rs2!=null)
			{
				if(rs2.next())
				{
					mb2=rs2.getLong("mobileno");
					ah2=rs2.getString("accountholder");
					System.out.println(ah2);
					
					b=rs2.getDouble("balance");
					System.out.println("your balance is="+b);
				}
				
			}
			System.out.println("Enter amount to be transfer");
			double d=sc.nextDouble();
			
			updatest=con.prepareStatement("update account set mobileno=?,accountholder=?,balance=? where aid=?");
			updatest.setLong(1,mb1);
			updatest.setString(2,ah1);
			updatest.setDouble(3,bal-d);
			updatest.setInt(4,id);
			
			int ans=updatest.executeUpdate();
			System.out.println("Account updated"+ans);
			
			updatest=con.prepareStatement("update account set mobileno=?,accountholder=?,balance=? where aid=?");
			updatest.setLong(1,mb2);
			updatest.setString(2, ah2);
			updatest.setDouble(3,b+d);
			updatest.setInt(4,id1);
		
			ans+=updatest.executeUpdate();
			System.out.println("Account updated"+ans);
			
			
			System.out.println("Enter id to delete");
			id=sc.nextInt();
			updatest=con.prepareStatement("delete from account where aid=?");
			updatest.setInt(1,id);
			ans=updatest.executeUpdate();
			System.out.println(ans+" records deleted");
			con.commit();
			
			
		}
		catch(SQLException e)
		{
			con.rollback();
			System.out.println(e.getMessage()+" "+e.getErrorCode()+" "+e.getSQLState());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("closing connection");
			if(con!=null) con.close();
		}

}
}
