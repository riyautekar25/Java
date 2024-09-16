package Assignment1;
// 1. Write a java program to validate a user name. 
//    The user name should start with a letter and contain only alphanumeric characters and underscores(_). 
//    The length of the user name should be between 5 and 20 characters.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1_pattern {

	public static boolean isValidUsername(String username) {
		String usernameRegex = "^[a-zA-Z][a-zA-Z0-9_]{4,19}$";
		Pattern pattern = Pattern.compile(usernameRegex);
		Matcher matcher = pattern.matcher(username);
		return matcher.matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a username to validate: ");
		String username = scanner.nextLine();

		if (isValidUsername(username)) {
			System.out.println("The username is valid.");
		} else {
			System.out.println("The username is invalid.");
		}

		scanner.close();

	}

}
