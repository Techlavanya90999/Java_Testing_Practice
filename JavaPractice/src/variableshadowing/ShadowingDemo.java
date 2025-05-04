package variableshadowing;

public class ShadowingDemo {
	String name = "Lavanya";
	int age = 26;
	
	public void display() {
		String name = "Mayuresh";
		int age = 32;
		System.out.println("Name = " + name);
		System.out.println("Age= " + age );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShadowingDemo obj = new ShadowingDemo();
		obj.display();
	}

}
