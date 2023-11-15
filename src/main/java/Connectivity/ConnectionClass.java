package Connectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    public Connection con;
public Connection getConnection()
{
    String dbName="Electronics Store";
    String userName="root";
    String password="";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/customer", "root", "");
    }
    catch (ClassNotFoundException ex){}
    catch (SQLException ex){
        ex.printStackTrace();
    }

    return con;
}
}
