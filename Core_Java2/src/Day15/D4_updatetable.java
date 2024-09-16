package Day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class D4_updatetable {

	public static void main(String[] args) {
		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/db";
			String username = "root";
			String password = "Admin123";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "UPDATE table2 SET tname=?, tcity=? WHERE tid=?";
			// Reading input from the user
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the updated name:");
			String name = br.readLine();
			System.out.println("Enter the new city:");
			String city = br.readLine();
			System.out.println("Enter the id:");
			int id = Integer.parseInt(br.readLine());
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);

			// Execute the update
			int rowsupdate = pstmt.executeUpdate();
			if (rowsupdate > 0) {
				System.out.println("existing user updated successfully");
			} else {
				System.out.println("no user found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
