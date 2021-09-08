import java.sql.*;
class database
{public static void main(String args[]) throws ClassNotFoundException, SQLException
{ResultSet r;
try
{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/surinder [surinder on SURINDER]","surinder","surinder");
    Statement st=c.createStatement();
    r=st.executeQuery("Select * from employee");
    System.out.println("");
    while(r.next())
        System.out.println(r.getInt(1)+"\t"+r.getInt(2));
    
}
catch(SQLException e)
{
    System.out.println("SQL Error"+e);
}
catch(Exception e)
{
    System.out.println("ERROR"+e);
}
}
        }