package hierarchicalinheritance;

public class ClassC extends ClassA {
public void c1()
	
	{
		System.out.println("C1 method");
	}
public void c2()

{
	System.out.println("C2 method");
}
public void c3()

{
	System.out.println("C3 method");
}
public static void main(String[] args) {

	/*ClassA obj = new ClassA();
	obj.a1();
	obj.a2();
	obj.a3();*/
	

	
	ClassA obj = new ClassB();
	obj.a1();
	obj.a2();
	obj.a3();
	
	/*ClassA obj = new ClassC();
	obj.a1();
	obj.a2();
	obj.a3();
	
	/*ClassB obj = new ClassB();
	obj.a1();
	obj.a2();
	obj.a3();
	obj.b1();
	obj.b2();
	obj.b3();*/
	
	//ClassC obj = new ClassC();
	//obj.a1();
	//obj.a2();
	//obj.a3();
	//obj.c1();
	//obj.c2();
	//obj.c3();
	
}
}