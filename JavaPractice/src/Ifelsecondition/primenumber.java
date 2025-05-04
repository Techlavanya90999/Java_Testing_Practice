package Ifelsecondition;

public class primenumber {

	public static void main(String[] args) {
for(int num=2; num<=100; num++) {
	boolean isprime = true;
	for(int i = 2; i<=Math.sqrt(num);i++)
	{
		if(num%i ==0)
		{
			isprime = false;
			break;
		}
	}
			
				if(isprime) {
					System.out.println(num);
				}
			}
		}
	
}
	


