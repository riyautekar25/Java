package Day5;

import java.util.Scanner;

public class D1_handleexception {

	public static void main(String[] args) {
		System.out.println("Program started...");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number: ");
			int  num = sc.nextInt();
			System.out.println(100/num);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program completed...");
		System.out.println("Program exited...");

	}

}


//finally block
/*try{statements}
 * catch(){statement}
 finally{statement}*/

// case 1: exception occurred, catch block handled--> finally block will execute
// case 2: exception occurred, catch block ignored--> finally block will execute
// case 3: exception does not occurred, catch block ignored--> finally block will execute
/*
 try{
 	open/establish the connection
 }catch(){
    filenotfound
 }
 finally{}
 */
 