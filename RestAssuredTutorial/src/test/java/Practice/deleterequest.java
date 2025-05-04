package Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleterequest {

	public static void main(String[] args) {
//configure base uri into RestAssured using RestAssured.baseURI = "actual uri"
		RestAssured.baseURI = "http://localhost:1212/employees/2";
		
//get RequestSpecification interface object using RestAssured.given()method
		RequestSpecification abc = RestAssured.given();
		
//select http delete request from requestspecification object
		Response xyz = abc.delete();
		
//capture status code using getStatusCode()method
		int a = xyz.getStatusCode();
		System.out.println(a);
		
//capture statusline using getStatusline()method
		String b = xyz.getStatusLine();
		System.out.println(b);
		
//capture response time using getTime()method
		long c = xyz.getTime();
		System.out.println(c);
		
	}

}
