package multilevelinheritance;

public class Pune1 extends Sample1 {
public static void d1() {
	System.out.println("d1 static method in Pune1 class");
	
}
public void d2() {
	System.out.println("d2 non static method in Pune1 class");
}
public static void main (String[] args) {
	/*Demo1 obj = new Demo1();
	obj.d1();
	obj.d2();*/
	
/*	Demo1 obj = new Sample1();
	obj.d1();
	obj.d2();
	
	Demo1 obj = new Pune1();
	obj.d1();
	obj.d2();
	
	Sample1 obj = new Sample1();
	obj.d1();
	obj.d2();
	
	Sample1 obj = new Pune1();
	obj.d1();
	obj.d2();*/
	
	Pune1 obj = new Pune1();
	obj.d1();
	obj.d2();
	
	
	
	
	
}
}
