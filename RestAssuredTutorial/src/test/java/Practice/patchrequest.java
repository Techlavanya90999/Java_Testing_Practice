package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class patchrequest {

	public static void main(String[] args) {
//configure base uri into restassured using RestAssured.baseURI = "actual uri"
		RestAssured.baseURI = "http://localhost:3000/employees/2";
		
//get RequestSpecification interface object using RestAssured.given()method
		RequestSpecification abc = RestAssured.given();
		
//use header method from requestspecification object by passing content-type and application/json
		abc.header("Content-Type","application/json");
		
//create request body in json format using JSONObject class
		JSONObject pqr = new JSONObject();
		
//create json object of json object class
		pqr.put("fName","Mayuresh");
		
//conver json object into string variable using ToString()method
		String lmo = pqr.toString();
		
//use body method from request specification object by passing converted json string object
		abc.body(lmo);
		
//select patch method from requestspecification object
		Response xyz = abc.patch();
		
//Capture Statuscode using StatusCode()method
		int a = xyz.getStatusCode();
		System.out.println(a);
		
//Capture StatusLine using getStatusLine()method
		String b = xyz.getStatusLine();
		System.out.println(b);
		
//capture Response Time using getTime method
		long c = xyz.getTime();
		System.out.println(c);
		
		
	}

}
