package Day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class D1_createtable {

	public static void main(String[] args) {
		try {
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating connection
			String url = "jdbc:mysql://localhost:3306/db";
			String username = "root";
			String password = "Admin123";
			Connection con = DriverManager.getConnection(url, username, password);
			// create a query
			String q = "create table table2(tid int(20) primary key auto_increment, tname varchar(50) not null, tcity varchar(50))";
			// create statement
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table created successfully!!");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
