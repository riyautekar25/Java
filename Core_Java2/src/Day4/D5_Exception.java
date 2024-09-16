package Day4;

import java.util.Scanner;

public class D5_Exception {

	public static void main(String[] args) {
		System.out.println("Program started....");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println(100/num);
		System.out.println("Program completed");
		System.out.println("Program exited");
	}

}



//Exception handling 
//Exceptions
//exception is an event which will cause program termination
//exception is not an error, it comes due to user mistakes.
//When user will provide the improper input or wrong password/ pin number etc 
//Developer handles the exception where exactly user providing the input

//Errors
//comes due to programmer/developers mistake
//syntax error: we can not execute the program
//logical error: programmer can execute program but not getting expected output.

//Types of exceptions:
//1. Checked exception: Exceptions that are identified by the java compiler 
// ex. InterruptedException, FileNotFoundException, IOException
//2. Unchecked exception: Exceptions which are not identified by the java compiler
// ex. ArithmeticExceptio, nullPointerException, ArrayIndexOutofBoundException
