package context;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBcontext {
	

	public static Connection GetConnection() throws ClassNotFoundException, SQLException{
		  String hostname="localhost";
		  String dbName="banvemaybay1";
		  String username="root";
		  String password="123456";
		  return GetConnection(hostname,dbName,username, password);
		 }
		 private static Connection GetConnection(String hostname, String dbName, String username, String password) 
		        throws ClassNotFoundException, SQLException {
		     Class.forName("com.mysql.jdbc.Driver");
		     String connectionURL="jdbc:mysql://"+hostname+":3306/"+dbName;
		     Connection conn=DriverManager.getConnection(connectionURL, username, password);
		     return conn;
		 }
		  
		}
	

