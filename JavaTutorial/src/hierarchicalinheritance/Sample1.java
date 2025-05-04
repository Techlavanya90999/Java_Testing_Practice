package hierarchicalinheritance;

public class Sample1 extends Demo1{
public static void d1() {
	System.out.println("d1 static method from Sample1 class");
}
public void d2() {
	System.out.println("d2 non static method from Sample1 class");
}
public static void main(String[] args) {
	/*Demo1 obj = new Sample1();
	obj.d1();
	obj.d2();*/
	
   Sample1 obj = new Sample1();
   obj.d1();
   obj.d2();
}
}
