package ThisSuper;

public class Sample2 extends Demo2 {
public void d1()
{
	System.out.println("d1 method present in Sample2 class");
}
public void d2()
{
	System.out.println("d2 method present in Sample2 class");
	this.d1();
	super.d1();
}
public static void main(String args[])
{
	Sample2 obj = new Sample2();
	obj.d2();
}
}
