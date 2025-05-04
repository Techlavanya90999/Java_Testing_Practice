package capture;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class capturesingleheadervalue {

	public static void main(String[] args) {
//configure base URI in rest assured
		RestAssured.baseURI = "http://localhost:3000/Employee/1";
		
//get request specification interface
		RequestSpecification abc = RestAssured.given();
		
//use get method from request specification object
		Response xyz = abc.get();
		
//use get() header method or header() method from response object by passing header keyname
		String a = xyz.getHeader("Content-Type");
		System.out.println(a);
		
//use get header()or header ()method from response object by passing header keyname
		String b = xyz.header("Date");
		System.out.println(b);
		
		String c = xyz.getHeader("Access-Control-Allow-Methods");
		System.out.println(c);

	}

}
