package Abstractionpractice;

public class AbstractDemo2 extends MyAbstractClass {

	public AbstractDemo2(int x, int y) {
		super(x, y);
	}
public static void main(String[]args) {
	AbstractDemo2 obj = new AbstractDemo2(5, 10);
	obj.print();
}
}
