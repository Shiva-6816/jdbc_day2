package mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSchema {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		
		Statement statement = connection.createStatement();
		
		statement.execute("create schema mobile_db");
		
		connection.close();
		
		
		System.out.println("sucessfully created schema in DB");
		
		
		
		
		
		
	}

}
