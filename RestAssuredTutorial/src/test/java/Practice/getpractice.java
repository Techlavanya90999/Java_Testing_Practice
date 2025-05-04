package Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getpractice {

	public static void main(String[] args) {
//configure base uri into restassured using RestAssured.baseURI="actual uri"
		RestAssured.baseURI= "http://localhost:3000/employees";
		
//get request specification interface object using RestAssured.given()method
		RequestSpecification abc = RestAssured.given();
		
//select http get request from request specification object
		Response xyz = abc.get();
		
//capture status code using status code method
		int a = xyz.getStatusCode();
		System.out.println(a);
		
//capture statusline using status line method
        String b = xyz.getStatusLine();
        System.out.println(b);
        
//capture response time using gettime method
        long c = xyz.getTime();
        System.out.println(c);


		
	}

}
