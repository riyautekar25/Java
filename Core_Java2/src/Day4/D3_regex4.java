package Day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D3_regex4 {

	public static void main(String[] args) {
		String patternstring = "^[\\w-]+@+[\\w-]+\\.+[\\w-] {2,4}$";
		Pattern pattern = Pattern.compile(patternstring);
		String[] emails = { "user@example.com", "user.name@domain.co", "valid-email@domain", "user@.com" };
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + " is valid email");
			} else {
				System.out.println(email + " is not valid email");
			}
		}
	}
}