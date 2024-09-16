package Day4;

import java.util.Scanner;

public class D6_exception {

	public static void main(String[] args) {
		System.out.println("Program started....");
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		System.out.println("Enter the position: ");
		int pos = sc.nextInt();
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		num[pos] = value;
		System.out.println("Program completed");
		System.out.println("Program exited");

	}

}
