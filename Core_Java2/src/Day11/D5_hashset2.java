package Day11;

import java.util.HashSet;

public class D5_hashset2 {

	public static void main(String[] args) {
		HashSet <Integer> eno = new HashSet<Integer>();
		eno.add(2);
		eno.add(3);
		eno.add(6);
		eno.add(8);
		eno.add(9);
		System.out.println(eno);
		HashSet<Integer> nos = new HashSet<Integer>();
		nos.addAll(eno);
		nos.add(12);
		System.out.println(nos);
		// remove all
		nos.removeAll(eno);
		System.out.println(nos);
	}

}
