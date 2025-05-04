package assignment;

public class reversestring {
	public void reverse (String a)
	{
char [] b = a. toCharArray();
for (int i= a.length()-1;i>=0;i--)
{
	System.out.print(b[i]);
}

}
	public static void main(String args []) {
		reversestring dm = new reversestring();
		dm.reverse("Lavanya");
	}
}