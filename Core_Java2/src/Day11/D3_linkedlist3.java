package Day11;

import java.util.LinkedList;

public class D3_linkedlist3 {

	public static void main(String[] args) {
		LinkedList l2 = new LinkedList();
		l2.add("dog");
		l2.add("dog");
		l2.add("cat");
		l2.add("horse");
		l2.add("tom");
		System.out.println(l2);

		// add first
		l2.addFirst("Tiger");
		System.out.println(l2);

		// add last
		l2.addLast("Elephant");
		System.out.println(l2);

		// getFirst
		System.out.println("First element is: " + l2.getFirst());

		// getLast
		System.out.println("Last element is: " + l2.getLast());
		
		//removeFirst and removeLast
		l2.removeFirst();
		l2.removeLast();
		System.out.println("After removing: "+l2);
		
	}

}
