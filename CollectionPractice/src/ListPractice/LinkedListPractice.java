package ListPractice;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<String> ab = new LinkedList<String>();
		ab.add("Software");
		ab.add("Testing");
		ab.add("Developer");
		System.out.println(ab);
		ab.remove("Software");
		ab.addFirst("Java");
		System.out.println(ab);

	}

}
