package AbstractionMethod;
//Abstract class

abstract class Vehicle{
    // Abstract method (without implementation)

	abstract void Run();
    // Concrete method (with implementation)

	void stop() {
		System.out.println("Vehicle stop");
	}
}
//Concrete subclass

class car extends Vehicle {
    // Implementing abstract method

	void Run() {
		System.out.println("Car Run");
	}
}
public class abstractClass {

	public static void main(String[] args) {
Vehicle car = new car();
car.Run();
car.stop();
	}

}
