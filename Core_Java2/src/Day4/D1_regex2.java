package Day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D1_regex2 {

	public static void main(String[] args) {
		String patternstring = "(\\d{3})-(\\d{3})-(\\d{4})";
		Pattern pattern = Pattern.compile(patternstring);
		// input string
		String input = "My mobile number is 123-456-7869";
		// check for matches
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
			System.out.println("Full match " + matcher.group(0));
			System.out.println("Area code " + matcher.group(1));
			System.out.println("Prefix " + matcher.group(2));
			System.out.println("Area no. " + matcher.group(3));
		}
	}

}
