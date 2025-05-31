package practice;

public class reversestring {

	public static void main(String[] args) {
String input = "i am Software Tester";
String[] words = input.split(" ");
StringBuilder result = new StringBuilder();
for(String word : words) {
	result.append(new StringBuilder (word).reverse().toString());
	result.append(" ");
}
System.out.println(result.toString().trim());
	}

}
