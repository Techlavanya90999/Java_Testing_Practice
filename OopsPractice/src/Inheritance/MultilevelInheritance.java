package Inheritance;
class Building{
	String name;
	public void Construction() {
		System.out.println("A");
	}
}
class School extends Building {
	public void Construction() {

	System.out.println("ABC");
}
}
class Office extends Building{
	public void Construction() {
		System.out.println("PQR");

}
	
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		School C1 = new School();
		C1.name = "Abc";
		Office O1 = new Office();
		O1.name = "Pqr";
		C1.Construction();
		O1.Construction();
	}

}
