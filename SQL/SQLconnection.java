package SQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLconnection {
	static private Connection con=null;
	
	public static Connection createConnectionWithMychatapp()
	{
		
		//this method create connection with database - mychatapp
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mychatapp","root","rootroot");
		} 
		catch (Exception e) 
		{ }
		return con;
	}
}
