package Day11;

import java.util.Collections;
import java.util.LinkedList;

public class D2_linkedlist2 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("X");
		l1.add("Y");
		l1.add("Z");
		LinkedList new_l1 = new LinkedList();
		new_l1.addAll(l1); // copying all elements of l1 to new_l1
		System.out.println("New list is: " + new_l1);

		// remove all
		new_l1.removeAll(l1);
		System.out.println(new_l1);

		// sort
		Collections.sort(l1);
		System.out.println("After Sorting in ascending order: " + l1);

		// reverse
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("After Sorting in descending order: " + l1);

		// shuffling
		Collections.shuffle(l1);
		System.out.println("After shuffling: " + l1);

	}

}
