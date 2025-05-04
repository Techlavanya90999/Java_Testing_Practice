package Practice;

public class Demo1 {

	public static void main(String[] args) {
		Person P1 = new Person();
		P1.name = "ABC";
		P1.age = 25;
		System.out.println(P1.age +" " + P1.name+" ");
		P1.walk();
		P1.Eat();
	}

}
class Person{
	String name;
	int age;
	void walk() {
		System.out.println("Person is Walking");
	}
	void Eat() {
		System.out.println("Person is Eating");
	}
}
