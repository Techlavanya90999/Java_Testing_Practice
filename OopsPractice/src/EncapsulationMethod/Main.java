package EncapsulationMethod;
class Employee{
	//private fields(data hiding)
	private String name;
	private int Age;
	private double salary;
	//public getter and setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		if(Age > 18) {
			
		this.Age = Age;
	} else {
		System.out.println("Age must be greater than 18");
	}
	}
		 public double getSalary() {
		        return salary;
		    }

		    public void setSalary(double salary) {
		        if (salary > 0) {
		            this.salary = salary;
		        } else {
		            System.out.println("Salary must be positive.");
		        }
			}
		}

public class Main {

	public static void main(String[] args) {
Employee emp = new Employee();
emp.setName("Alice");
emp.setAge(20);
emp.setSalary(50000.5);

System.out.println("Employee Name: " + emp.getName());
System.out.println("Employee Age: " + emp.getAge());
System.out.println("Employee Salary: " + emp.getSalary());
	}

}
