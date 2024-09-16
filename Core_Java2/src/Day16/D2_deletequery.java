package Day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class D2_deletequery {
	// Class.forName("com.mysql.cj.jdbc.Driver");
	private static final String url = "jdbc:mysql://localhost:3306/db";
	private static final String username = "root";
	private static final String password = "Admin123";

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	// Method to delete a record
	public void deleteEmployee(int id) {
		String q = "delete from employee where id = ?";

		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(q);) {
			pstmt.setInt(1, id);
			int rowsaffected = pstmt.executeUpdate();
			if (rowsaffected > 0) {
				System.out.println("Employee " + id + " record deleted...");
			} else
				System.out.println("No record found...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getAllEmployees() {
		String q = "select * from employee";
		try (Connection con = getConnection(); Statement stmt = con.createStatement();) {
			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				int id = set.getInt("id");
				String name = set.getString("ename");
				String pos = set.getString("position");
				String sal = set.getString("esalary");
				System.out.println("ID: " + id + " Name: " + name + " Position: " + pos + " Salary: " + sal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the id:");
//		int id = Integer.parseInt(br.readLine());
//		getConnection();
//		getAllEmployees();
//		deleteEmployee(id);
//		getAllEmployees();
		// Display all emp info
		D2_deletequery emp = new D2_deletequery();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Current employees:");
		emp.getAllEmployees();
		// Delete an emp info with id
		System.out.println("Enter the id:");
		int id = scanner.nextInt();
		emp.deleteEmployee(id);
		// display the remaining records
		System.out.println("Remaining employees:");
		emp.getAllEmployees();
	}

}
