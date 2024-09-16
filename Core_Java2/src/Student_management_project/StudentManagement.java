package Student_management_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DatabaseConnection {
	private static final String url = "jdbc:mysql://localhost:3306/student_management";
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
}

class Student {
	private int id;
	private String name;
	private int age;
	private String grade;

	public Student(int id, String name, int age, String grade) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGrade() {
		return grade;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String toString() {
		return "Student{id=" + id + ", name='" + name + "', age=" + age + ", grade='" + grade + "'}";
	}
}

class StudentDAO {
	public void addStudent(Student student) throws SQLException {
		String query = "INSERT INTO Students (name, age, grade) VALUES (?, ?, ?)";
		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement stmt = connection.prepareStatement(query);) {
			stmt.setString(1, student.getName());
			stmt.setInt(2, student.getAge());
			stmt.setString(3, student.getGrade());
			stmt.executeUpdate();
		}
	}

	public Student getStudent(int id) throws SQLException {
		String query = "SELECT * FROM Students WHERE id = ?";
		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("grade"));
				}
			}
		}
		return null;
	}

	public List<Student> getAllStudents() throws SQLException {
		List<Student> students = new ArrayList<>();
		String query = "SELECT * FROM Students";
		try (Connection connection = DatabaseConnection.getConnection();
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {
			while (rs.next()) {
				students.add(
						new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("grade")));
			}
		}
		return students;
	}

	public void updateStudent(Student student) throws SQLException {
		String query = "UPDATE Students SET name = ?, age = ?, grade = ? WHERE id = ?";
		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setString(1, student.getName());
			stmt.setInt(2, student.getAge());
			stmt.setString(3, student.getGrade());
			stmt.setInt(4, student.getId());
			stmt.executeUpdate();
		}
	}

	public void deleteStudent(int id) throws SQLException {
		String query = "DELETE FROM Students WHERE id = ?";
		try (Connection connection = DatabaseConnection.getConnection();
				PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setInt(1, id);
			stmt.executeUpdate();
		}
	}
}

public class StudentManagement {
	private final StudentDAO studentDAO = new StudentDAO();
	private final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		StudentManagement management = new StudentManagement();
		management.run();
	}

	public void run() {
		List<Student> students = List.of(new Student(0, "Alice", 20, "A"), new Student(0, "Bob", 22, "B"),
				new Student(0, "Charlie", 21, "C"));

		Thread addThread = new Thread(() -> {
			for (Student student : students) {
				try {
					studentDAO.addStudent(student);
					System.out.println("Added: " + student);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		addThread.start();
		try {
			addThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.print("Enter student id to update: ");
		int updateId = scanner.nextInt();
		scanner.nextLine();
		updateStudent(updateId);

		System.out.print("Enter student id to delete: ");
		int deleteId = scanner.nextInt();
		scanner.nextLine();
		deleteStudent(deleteId);

		getAllStudents();
	}

	private void updateStudent(int id) {
		try {
			Student student = studentDAO.getStudent(id);
			if (student != null) {
				System.out.print("Enter new name: ");
				String name = scanner.nextLine();
				System.out.print("Enter new age: ");
				int age = scanner.nextInt();
				System.out.print("Enter new grade: ");
				String grade = scanner.next();
				scanner.nextLine();

				student.setName(name);
				student.setAge(age);
				student.setGrade(grade);

				Thread updateThread = new Thread(() -> {
					try {
						studentDAO.updateStudent(student);
						System.out.println("Updated: " + student);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				});
				updateThread.start();
				try {
					updateThread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Student not found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void deleteStudent(int id) {
		Thread deleteThread = new Thread(() -> {
			try {
				studentDAO.deleteStudent(id);
				System.out.println("Deleted student with id " + id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		deleteThread.start();
		try {
			deleteThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void getAllStudents() {
		Thread readThread = new Thread(() -> {
			try {
				List<Student> allStudents = studentDAO.getAllStudents();
				allStudents.forEach(System.out::println);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		readThread.start();
		try {
			readThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
