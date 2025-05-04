package Encapsulation;

public class Demo2
{
		private void login()
		{
					System.out.println("login private method");
		}

		public void getLogin()
		{
			login();
		}	

		private void createUser(String firstname, String lastname)
		{
				System.out.println("firstName  value is ::"+firstname);
				System.out.println("lastname  value is ::"+lastname);
		}			

		public void setCreateUser(String firstName, String lastName)
		{
			createUser(firstName, lastName);


}
}