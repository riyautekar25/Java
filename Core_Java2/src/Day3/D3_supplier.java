package Day3;

import java.util.Date;
import java.util.function.Supplier;

public class D3_supplier {

	public static void main(String[] args) {
		Supplier<Date> s=()->new Date(); // here date is not an argument, it is a return type
		System.out.println(s.get());
	}

}

//Predefined functional interface
//Supplier
//- which takes no argument and returns a value
//- abstract method is get()

