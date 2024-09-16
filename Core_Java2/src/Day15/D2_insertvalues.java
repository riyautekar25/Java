package Day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class D2_insertvalues {

	public static void main(String[] args) {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create the connection 
			String url ="jdbc:mysql://localhost:3306/db";
			String username = "root";
			String password = "Admin123";
			Connection con1 = DriverManager.getConnection(url,username,password);
			String q = "insert into table2(tname,tcity)values(?,?)";
			// get the prepared statement object
			PreparedStatement pstmt = con1.prepareStatement(q);
			//set the values to query
			pstmt.setString(1, "Siri");
			pstmt.setString(2, "Bengaluru");
			pstmt.executeUpdate();
			System.out.println("Values inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
