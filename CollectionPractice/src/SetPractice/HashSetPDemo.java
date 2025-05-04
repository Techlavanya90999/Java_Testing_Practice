package SetPractice;

import java.util.HashSet;

public class HashSetPDemo {

	public static void main(String[] args) {
HashSet<String>pq = new HashSet<String>();
pq.add("America");
pq.add("China");
pq.add("Japan");
System.out.println(pq);
boolean isAdded1 = pq.add("Africa");
System.out.println(pq);
System.out.println(pq);

	}

}
