package ThisSuper;

public class Sample1 extends Demo1
{
		
		String a = "Monitor";
		public void display() {
			String a = "Mouse";
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
		}
		public static void main(String args [])
		{
			Sample1 obj = new Sample1();
			obj.display();
		}


}