package mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_db","root", "root");
		
	Statement statement =	connection.createStatement();
	
	statement.execute("create table mobile(id int primary key, brand varchar(20),price double, colour varchar(20))");
	
	connection.close();
	
	System.out.println("sucessfully created table in mobile_db schema");
		
		

	}

}
