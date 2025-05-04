package Assignment;

public class reversestring2values {
	public static void main(String[] args) {
		String a = "firstname lastname";

		String[] abc = a.split(" ");

		for(int i=0;i<abc.length;i++)
		{
			 String c= abc[i];
			 		 
			 for(int j=c.length()-1;j>=0;j--)
			 {
				 System.out.print(c.charAt(j));
			 }
			 
			 System.out.print(" ");
		
		}
		
	}

}

	/*public static void main(String[] args) {
String a = "Firstname Lastname";
String [] abc = a.split("");
for(int i=0;i<abc.length;i++)
{
	String c =abc[i];//kadam
	for(int j=c.length()-1;j>=0;j--)
	{
		System.out.print(c.charAt(j));
	}
	System.out.print("");
}
		
	}
}
		
		
	for (int i=a.length()-1;i>=0;i--)
{
	System.out.print(a.charAt(i));
}

	}*/


