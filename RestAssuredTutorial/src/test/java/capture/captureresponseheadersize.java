package capture;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class captureresponseheadersize {

	public static void main(String[] args) {
//configure base URI in rest assurd
		RestAssured.baseURI = "http://localhost:3000/Employee/1";
		
//get RequestSpecification interface object
		RequestSpecification abc = RestAssured.given();
		
//use get()method from requestspecification object
		Response xyz = abc.get();
		
//capture all response header
	Headers pqr = xyz.getHeaders();
	
//conver headers object into string format using tostyring()method
	String ab = pqr.toString();
	
//conver sting into byte[]array using get bytes()method
	byte[]cd = ab.getBytes();
	
//capture size or length of array using length property
	int a = cd.length;
	System.out.println(a);
	}

}
