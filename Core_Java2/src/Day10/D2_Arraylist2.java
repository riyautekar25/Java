package Day10;

import java.util.ArrayList;
import java.util.Collections;

public class D2_Arraylist2 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("X");
		a1.add("Y");
		a1.add("Z");
		a1.add("A");
		a1.add("B");
		a1.add("C");
		ArrayList a1_DUP = new ArrayList();
		a1_DUP.addAll(a1);
		System.out.println(a1_DUP);
		a1_DUP.removeAll(a1_DUP);
		System.out.println("After removing: "+a1_DUP);
		System.out.println("Elements in the list before sorting: "+a1);
		Collections.sort(a1);
		System.out.println("Elements in the list after sorting: "+a1);
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("Elements in the list after reversing: "+a1);
		// shuffling
		Collections.shuffle(a1);
		System.out.println("After shuffle: "+a1);
	}

}
