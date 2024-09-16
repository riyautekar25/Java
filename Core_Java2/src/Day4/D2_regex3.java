package Day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D2_regex3 {

	public static void main(String[] args) {
		String patternstring = "\\d+"; // "+" here matches one or more consecutive digits
		Pattern pattern = Pattern.compile(patternstring);
		String input = "There are 123 apples and 400 oranges";
		// create the matcher object
		Matcher matcher = pattern.matcher(input);
		String replaced = matcher.replaceAll("#");
		System.out.println(replaced);
		

	}

}
