package capture;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class captureresponsebody {

	public static void main(String[] args) {
//configure base URI in rest assured
		RestAssured.baseURI = "http://localhost:3000/Employee/1";
		
//get the request specification interface
		RequestSpecification abc = RestAssured.given();
		
//use get()method from request specification object
		Response xyz = abc.get();
		
//capture all response body in string format
		String ab = xyz.getBody().asString();
		
//convert string into the bytes
		byte[]cd = ab.getBytes();
		
//capture length of array
		int a = cd.length;
		System.out.println(a);
		
		
	}

}
