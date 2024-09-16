package Day13;

import java.sql.Connection;
import java.sql.DriverManager;

class D1_jdbc1 {

	public static void main(String[] args) {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// creating connection
			String url = "jdbc:mysql://localhost:3306/db";
			String username = "root";
			String password = "Admin123";
			Connection con = DriverManager.getConnection(url, username, password);

			if (con.isClosed()) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Connection created");
			}
		} catch (Exception e) {

		}

	}

}
