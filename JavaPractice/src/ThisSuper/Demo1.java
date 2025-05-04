package ThisSuper;

public class Demo1 {
	String a = "Selenium";

	public void abc() {
		String a = "Github";
		System.out.println(a);
		System.out.println(this.a);
	}

	public void pqr() {
		String a = "Maven";
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		obj.abc();
		obj.pqr();

	}

}
