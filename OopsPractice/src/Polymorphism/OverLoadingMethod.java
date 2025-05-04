package Polymorphism;
class Employee{
	String name;
	int age;
	//same function (PrintInfo) with different argument
	//function with 1st argument
	public void PrintInfo(String name) 

	{
		System.out.println("name");
	}
	//	//function with 2nd argument

	public void PrintInfo(int age) {
		System.out.println("Age");
	}
	//function with both argument

	public void PrintInfo(String name, int age) {
		System.out.println(name + ""   + age);
	}
	
}
public class OverLoadingMethod{
public static void main(String args[]) {
	Employee E1 = new Employee();
	E1.name = "Aman";
	E1.age = 25;
	E1.PrintInfo(E1.name,   E1.age);
}
}