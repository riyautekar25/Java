package Day11;

import java.util.Iterator;
import java.util.LinkedList;

public class D1_linkedlist {

	public static void main(String[] args) {
		// Declare the linked list
		//LinkedList l = new LinkedList();
		//LinkedList <String> l = new LinkedList<String>();
		LinkedList l = new LinkedList();
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add(true);
		l.add(null);
		System.out.println(l);
		System.out.println("Size of the linked list: "+l.size());
		l.remove(3);
		System.out.println("After remove: "+l);
		// insert
		l.add(3, "java");
		System.out.println("After inserting: "+l);
		// Retrieve
		System.out.println("Retrieving element: "+l.get(1));
		// Replace
		l.set(2, 100);
		System.out.println("After replacing: "+l);
		// contains
		System.out.println(l.contains("java"));
		System.out.println(l.contains("pyhton"));
		// isempty
		System.out.println("Is list empty: "+l.isEmpty());
		// for each loop
		System.out.println("For each loop: ");
		for(Object ele: l) {
			System.out.print(ele+" ");
		}
		//iterator method
		System.out.println("\nIterator method: ");
		Iterator iter = l.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	}

}
