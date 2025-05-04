package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putrequest {

	public static void main(String[] args) {
//configure base uri into restassured using RestAssured.baseURI= "actual url"
		RestAssured.baseURI= "http://localhost:3000/employees/1";
		
//get RequestSpecification interface object using RestAssured.given ()method
		RequestSpecification abc = RestAssured.given ();

//use header method from requestspecification object by passing content-Type and application/json
		abc.header("Content-Type","application/json");
		
//create request body in json format using JSONObject class
		JSONObject pqr = new JSONObject();
		
//create object of json object class
		pqr.put("firstName","Rahul");
		pqr.put  ("lastName","Yadav");
		pqr.put  ("address","nagar");
		pqr.put  ("mobileNumber",909099);
		
//convert json object into string variable
		String lmo = pqr.toString();
		
//use body ()method from RequestSpceification object by passing converted json object string variable
		abc.body(lmo);
		
//select http pur request from request specification object
		Response xyz = abc.put();
		
//capture StatusCode using getStatusCode()method
		int a = xyz.getStatusCode();
		System.out.println(a);
		
//capture Statusline using getstatusline()method
		String b = xyz.getStatusLine();
		System.out.println(b);
		
//capture Response time using getTime ()method
		long c = xyz.getTime();
		System.out.println(c);
		
		
		
		
		
		
	}

}
