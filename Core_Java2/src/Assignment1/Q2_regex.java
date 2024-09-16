package Assignment1;
// 2. Create a java program to extract all email addresses from a given text using regular expressions.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Q2_regex {
	public static List<String> extractEmailAddresses(String text) {
		List<String> emailList = new ArrayList<>();
		String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";

		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			emailList.add(matcher.group());
		}

		return emailList;
	}

	public static void main(String[] args) {
		String text = "Here are some email addresses: example@example.com, test.user@domain.co.uk, "
				+ "first.last@sub.domain.org, invalid-email@domain, another.valid@example.net";

		List<String> emails = extractEmailAddresses(text);

		System.out.println("Extracted email addresses:");
		for (String email : emails) {
			System.out.println(email);
		}

	}

}

