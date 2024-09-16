package Assignment1;

//4. Create a custom Exception called ‘InvalidInputException’ Write a java program that throws this exception if the user input is not positive integer.
import java.util.Scanner;

class InvalidInputException extends Exception {
	public InvalidInputException(String message) {
		super(message);
	}
}

public class Q4_throws {
	public static void checkPositiveInteger(int number) throws InvalidInputException {
		if (number <= 0) {
			throw new InvalidInputException("Input is not a positive integer: " + number);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");

		try {
			int userInput = scanner.nextInt();
			checkPositiveInteger(userInput);
			System.out.println("You entered a valid positive integer: " + userInput);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter a valid integer.");
		}
	}

}
