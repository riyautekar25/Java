package Day4;

import java.util.regex.Pattern;

public class D4_regex5 {

	public static void main(String[] args) {
		String patternstring = "\\s"; // one or more white space character
		// pattern
		Pattern pattern = Pattern.compile(patternstring);
		String input = "This is testing string";
		String[] parts = pattern.split(input);
		for (String part : parts) {
			System.out.println(part);

		}
	}

}


