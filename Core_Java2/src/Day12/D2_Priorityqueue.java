package Day12;

import java.util.Iterator;
import java.util.PriorityQueue;

public class D2_Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		// add() and offer() ----using this two methods you can take elements one by one
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("D");
		q.offer("F");
		System.out.println(q);
		
		//get head element and peek
		System.out.println(q.element());// if queue is empty it returns NoSuchElement exception
		System.out.println(q.peek());// if queue is empty it returns null
		
		//return and remove
		System.out.println(q.remove()); // if queue is empty it returns NoSuchElement exception
		System.out.println(q);
		
		//poll
		System.out.println(q.poll()); // if queue is empty it returns null
		System.out.println(q);
		
		// iterator method
		System.out.println("Iterator method");
		Iterator it = q.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
		// for each loop
		System.out.println("\nfor each loop:");
		for(Object ele: q) {
			System.out.print(ele);
		}
		
	}

}
