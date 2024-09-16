package Assignment1;
// 3. Write a java program that reads an integer from the user and handles ‘inputMismatchException‘ and ‘ArithmeticException’ when dividing a number by the input integer.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3_exception {
	public static int divide(int dividend, int divisor) throws ArithmeticException {
		return dividend / divisor;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int divisor = 0;
		int dividend = 100; // For example purposes, using a constant dividend

		System.out.print("Enter an integer to divide 100 by: ");

		try {
			divisor = scanner.nextInt();
			int result = divide(dividend, divisor);
			System.out.println("Result: " + dividend + " / " + divisor + " = " + result);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid integer.");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic error: " + e.getMessage());
		}
	}

}
