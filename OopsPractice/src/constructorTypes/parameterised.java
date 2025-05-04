package constructorTypes;
class Employee{
	String name;
	Integer age;
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	//add parameter value (String name, Integer age)
	Employee(String name, Integer age){
		//1st name is object and 2nd is from above parameter
		this.name = name;
		//1st age is object and 2nd is from above parameter
        this.age = age;
		
	}
}
public class parameterised {

	public static void main(String[] args) {
		//object created
    Employee E1 = new Employee("Raju",23);
   
    E1.printInfo();
	}

}
