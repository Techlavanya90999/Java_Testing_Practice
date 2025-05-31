package practice;

public class StringPractice {

	public static void main(String[] args) {
		String str = "Lavanya";
		System.out.println(str.hashCode());
		str.toLowerCase();
		System.out.println(str.hashCode());
		System.out.println(str.toLowerCase() + str.toLowerCase().hashCode() );
	}

}
