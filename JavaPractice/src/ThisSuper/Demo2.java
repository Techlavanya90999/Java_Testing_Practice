package ThisSuper;

public class Demo2 {
	public void d1() {
System.out.println("d1 method in Demo2 class");
}
	public void d2() {
		System.out.println("d2 method in Demo2 class");
		this.d1();
	}
	public static void main(String args[])
	{
		Demo2 obj = new Demo2();
		obj.d1();
		obj.d2();
	}
}