package Day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class D1_selectquery {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db";
			String username = "root";
			String password = "Admin123";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "select * from table2";
			// create statement object
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				int id = set.getInt("tid");
				String name = set.getString("tname");
				String city = set.getString("tcity");
				System.out.println("ID: " + id + " Name: " + name + " City: " + city);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
