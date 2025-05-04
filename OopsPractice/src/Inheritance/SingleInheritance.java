package Inheritance;



class Shape{
	String colour;
	public void area() {
		System.out.println("Red Colour");
	}
}
class Triangle extends Shape{
	
}
public class SingleInheritance {

	public static void main(String[] args) {
Triangle T1 = new Triangle();
T1.colour = "Red";
T1.area();
	}

}
