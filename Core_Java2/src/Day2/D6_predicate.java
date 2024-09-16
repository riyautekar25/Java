package Day2;

import java.util.function.Predicate;

public class D6_predicate {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(20)); // true
		System.out.println(p.test(5)); // false
		// Ex2
		Predicate<String> pr = s -> (s.length() > 4);
		System.out.println(pr.test("welcome")); // true
		System.out.println(pr.test("abc")); // false
		// ex3
		String names[] = { "david", "smith", "scott", "siri", "sujan" };
		for (String name : names) {
			if (pr.test(name)) {
				System.out.println(name);
			}
		}

	}

}

//predefined functional interface
//-java 8 onwards 
//1.predicate-test()
//2.Function- apply();
//3.consumer- accept()
//4.supplier- get();
//-1. predicate contains one abstract method called test();
//-Predicate interface used to check some conditions
//-it always return boolean value
//interface predict <T>{
//public abstract boolean test(T t)}