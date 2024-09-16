package Day4;

import java.util.Scanner;

public class D9_handleexception {

	public static void main(String[] args) {
		System.out.println("Program started....");
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(100/num);
		}
		catch(ArithmeticException e) {
			System.out.println("Wrong input");
		}
		System.out.println("Program completed");
		System.out.println("Program exited");

	}

}


//how to handle the exception
//using try catch block
//try {} ----- u write try block where the user is taking input
/*
try {
statement
}
catch (ArithmeticException e){
statement
}
*/
// one try block can have multiple catch blocks
// if we don't know exact exception then how to handle them?

