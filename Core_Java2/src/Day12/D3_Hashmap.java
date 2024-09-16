package Day12;

import java.util.HashMap;

public class D3_Hashmap {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		// HashMap <Integer, String>m = new HashMap<Integer, String>();
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tieson");
		m.put(106, "John");

		System.out.println(m);

		// get
		System.out.println(m.get(105));

		// remove
		m.remove(106);
		System.out.println(m);

		// contains
		System.out.println(m.containsKey(105));
		System.out.println(m.containsValue("Mary"));

		// is empty
		System.out.println(m.isEmpty());

		// Key set
		System.out.println(m.keySet()); // returns set of all the keys

		// only values
		System.out.println(m.values()); // returns all the values as a set

		// read individual object
		System.out.println("========================");
		for (Object ele : m.keySet()) {
			System.out.println(ele);
		}
		System.out.println("-------------------------");
		for (Object e : m.values()) {
			System.out.println(e);
		}

		// extract key values
		System.out.println("-------------------------");
		for (Object e : m.keySet()) {
			System.out.println(e + " " + m.get(e));
		}

	}

}
