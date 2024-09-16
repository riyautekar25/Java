package Day12;

import java.util.Hashtable;

public class D4_Hashtable {

	public static void main(String[] args) {
		// HashTable t = new HashTable(); // capacity is 11, load factor is 0.75
		// HashTable t = new HashTable(100);
		// HashTable t = new HashTable(100,(float)0.85);
		Hashtable<Integer, String> t = new Hashtable<Integer, String>();
		t.put(101, "John");
		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Scott");
		t.put(104, "Tieson");
		//t.put(null, "Johnson");// NullPointerException
		//t.put(106, null); // NullPointerException
		System.out.println(t);
		
	}

}
