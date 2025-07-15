import java.sql.*;
import java.io.*;
class Tran1
{
	public static void main(String [] ss)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
			"system","mca6");
			
			Statement s = c.createStatement();
			
			c.setAutoCommit(false);
			
			int x = s.executeUpdate("update emp101 set name='meesa' where pass='rabari1' ");
			ResultSet result1 = s.executeQuery("select * from emp101 where pass='rabari1' ");

            while(result1.next())
            {
                System.out.println("id: " + result1.getString(1));
                System.out.println("name " + result1.getString(2));
			}
			
		    c.rollback();
			System.out.println("after rollback");
			ResultSet result2 = s.executeQuery("select * from emp101 where pass='rabari1' ");

            while(result2.next())
            {
                System.out.println("id: " + result1.getString(1));
                System.out.println("name " + result1.getString(2));
			}
		    c.commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}