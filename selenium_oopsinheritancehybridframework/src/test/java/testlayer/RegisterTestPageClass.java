package testlayer;


import baselayer.baseclass;
import pagelayer.Registerpage;

public class RegisterTestPageClass extends baseclass {

	public static void main(String[] args) throws InterruptedException {
		baseclass.initialization();
		Registerpage obj = new Registerpage();
		obj.personalinfo("Lavanya", "D", "Pune", "Kharadi","99601367979", "456789123","Dec", "2021", "12", "F", "Maharashtra");
		obj.usernameandpassword("lavanya@gmail.com", "lavanya12", "lavanya12");
		obj.recovery("What is your School name?", "xyz");
	}

}
