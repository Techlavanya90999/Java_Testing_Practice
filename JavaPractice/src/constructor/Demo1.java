package constructor;

public class Demo1 {
	public Demo1() {
		System.out.println("no arguments");
		
	}
	public Demo1(int a) {
		System.out.println("1 int arguments");

	}
	public Demo1(int a, String b) {
		System.out.println("1 int and 1 string arguments");

	}

	public static void main(String[] args) {
Demo1 obj = new Demo1(10, "Lavanya");
	}

}
