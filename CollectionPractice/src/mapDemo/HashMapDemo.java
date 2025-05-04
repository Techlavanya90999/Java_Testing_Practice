package mapDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> pq = new HashMap<String, Integer>();
		pq.put("Software", 5);
		pq.put("Java", 2);
		pq.put("Testing", 7);
		pq.put("Developer", 9);
		System.out.println(pq);
	}

}
