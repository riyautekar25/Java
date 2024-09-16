package Day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class D3_Dynamicinsert {

	public static void main(String[] args) {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create Connection
			String url ="jdbc:mysql://localhost:3306/db";
			String username = "root";
			String password = "Admin123";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "insert into table2 (tname,tcity) values(?,?)";
			//get the prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the name:");
			String name = br.readLine();
			System.out.println("Enter the city:");
			String city = br.readLine();
			// set the values to query
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.executeUpdate();
			System.out.println("values inserted...");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
