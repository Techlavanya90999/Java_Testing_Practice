package ListPractice;

import java.util.Vector;
import java.util.stream.Gatherer.Integrator;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(5, 4);

		System.out.println(v);
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(6);
		v.addElement(9);
		v.addElement(3);
		v.addElement(3);

		v.addElement(7);

		System.out.println(v);
		System.out.println("Current Capacity:" + v.capacity());

	}

}
