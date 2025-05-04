package Polymorphism;
class Mathematics{
	int add(int a, int b) {
	return a + b;
	
}
	double add (double a, double b) {
		return a + b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
Mathematics math = new Mathematics();
System.out.println("Sum of 2 integer " + math.add(5, 10));
System.out.println("sum of 2 double " + math.add(10.5, 5.5));

	}

}
