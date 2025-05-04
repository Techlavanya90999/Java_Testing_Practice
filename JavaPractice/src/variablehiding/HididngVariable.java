package variablehiding;

class Parent{
	String a = "Parents";
public void print() {
	System.out.println(a);
}
}
class Child extends Parent{
	String a = "Child";
	public void print() {
		System.out.println(a);
	}
}
public class HididngVariable {

	public static void main(String[] args) {
Parent obj = new Child();
obj.print();

}
	}


