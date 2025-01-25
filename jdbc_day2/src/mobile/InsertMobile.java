package mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMobile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Mobile ID");
		int id = scanner.nextInt();

		System.out.println("Enter Mobile Brand");
		String brand = scanner.next();

		System.out.println("Enter Mobile Price");
		double price = scanner.nextDouble();

		System.out.println("Enter Mobile Colour");
		String colour = scanner.next();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_db", "root", "root");

		Statement statement = connection.createStatement();

		statement.execute("insert into mobile values("+id+",'"+brand+"',"+price+",'"+colour+"')");

		connection.close();
		
		System.out.println("sucessfully inserted values ");

	}

}
