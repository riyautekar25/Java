package Day11;

import java.util.HashSet;
import java.util.Iterator;

public class D4_hashset {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add("welcome");
		hs.add(19.89);
		hs.add('a');
		hs.add(true);
		hs.add(null);
		System.out.println(hs);
		// remove
		hs.remove(19.89);
		System.out.println(hs);
		
		// contains 
		System.out.println(hs.contains("welcome"));
		System.out.println(hs.contains("java"));
		
		// isempty
		System.out.println("Is empty? "+hs.isEmpty());
		
		// for each loop
		System.out.println("For each: ");
		for(Object ele: hs) {
			System.out.println(ele);
		}
		
		// Iterator
		System.out.println("Iterator: ");
		Iterator iter = hs.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}

	}

}

