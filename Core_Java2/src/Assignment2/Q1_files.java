package Assignment2;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q1_files {

	public static void main(String[] args) throws  IOException{
		CharArrayWriter cw = new CharArrayWriter();
		cw.write("Welcome to Assignment2 of java module");
		FileWriter f1 = new FileWriter("a.txt");
		cw.writeTo(f1);
		FileWriter f2 = new FileWriter("b.txt");
		cw.writeTo(f2);
		FileWriter f3 = new FileWriter("c.txt");
		cw.writeTo(f3);
		System.out.println("Successfully written to all three files!!");
		f1.close();
		f2.close();
		f3.close();
	}

}
