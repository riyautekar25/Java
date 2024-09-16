package Day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D4_regex {

	public static void main(String[] args) {
		String t="cat";
		Pattern pattern = Pattern.compile(t);
		String input = "The cat sat on the mat";
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			System.out.println("Found at "+matcher.start()+" to "+matcher.end());
		}

	}

}



//Regular expression
//introduced in jdk 1.4 onwards 
//regex : short form for regular expressions
//regex is a powerful tool in java for defining patterns that can be used for searching, editing and manipulating strings
//java.util.regex package
//Pattern, matcher, pattern syntax exception
//1. Pattern class 
//- used to define a pattern for regex
//- to create the object we use static method called as compile
//- Example:
// Pattern pattern(object) = pattern compile("abcd")
//2. Matcher class
//- It is used to match the character sequence 
//- Example:
// Pattern pattern = pattern compile("abcd");
//	  Matcher matcher = pattern.matcher("test");  


// Matcher class methods:
//1. boolean matches()