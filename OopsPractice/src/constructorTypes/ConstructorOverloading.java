package constructorTypes;
class Faculty{
	String name;
	Integer age;
	public void Display() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	//Default Constructor
	Faculty(){
		name = "Shiv";
		age = 25;
	}
	// 1 parameterized constructor
	Faculty(String name){
		this.name = name;
		this.age = 26;
	}
	// 2 parameterized constructor

	Faculty(String name, Integer age){
		this.name = name;
		this.age = age;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
Faculty F1 = new Faculty();
Faculty F2 = new Faculty("Aman");
Faculty F3 = new Faculty("Raj",24);
F1.Display();
F2.Display();
F3.Display();

	}

}
