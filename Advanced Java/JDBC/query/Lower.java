import java.sql.*;
import java.io.*;
class Lower
{
    public static void main(String []ss)
    {
        try
		{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                                                       "system","mca6");

            int t1 = 123;
            String t2 = "lalu";

            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //int x = s.executeUpdate("UPDATE Employee SET Name=LOWER(Name)");
            int x = s.executeUpdate("UPDATE Employee SET Name=UPPER(Name)");

            System.out.println(x);
		}
		catch(SQLException e)
        {
            System.out.println(e);
        }
		catch(Exception i)
		{
			System.out.println(i);
		}
    }
}

//c:\oraclexe\app\oracle\product\10.2.0\server\jdbc\lib\ojdbc14.jar
