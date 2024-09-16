package Day10;

import java.util.ArrayList;
import java.util.Arrays;

public class D3_Arraylist3 {

	public static void main(String[] args) {
		String arr[]= {"Dog", "Cat", "Monkey"};
		for (String value: arr) {
			System.out.println(value);
		}
		ArrayList a1 = new ArrayList(Arrays.asList(arr));
		System.out.println(a1);

	}

}
