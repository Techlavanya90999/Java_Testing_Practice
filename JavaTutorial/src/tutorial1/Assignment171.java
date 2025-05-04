package tutorial1;

public class Assignment171 {

	public static void main(String[] args) {
       /*1) if age is between 1 to 11 then print child keyword
		2) if age is between 12 to 17 then print teen keyword
		3) if age is between 18 to 64 then print adult keyword
		4) if age is above 64+ then print senior*/
		int age = 14;
		if((age>=1) && (age<=11)) {
		System.out.println("child");
		}
		else if ((age>=12)&&(age<=17)) {
			System.out.println("teen");
		}
		else if ((age>18)&&(age<64)) {
			System.out.println("adult");
		}
		else {
			System.out.print("senior");
		}
	}

		
}
