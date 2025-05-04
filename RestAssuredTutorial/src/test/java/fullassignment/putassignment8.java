package fullassignment;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putassignment8 {

	public static void main(String[] args) {
//configure base uri in rest assured 
		RestAssured.baseURI = "http://localhost:4000/Employee/2";

//get requestspecification interface  object
		RequestSpecification abc = RestAssured.given();
		
//use header method from requestspecification interface object
		abc.header("Content-Type", "application/json");

//create request body in json format
		JSONObject pqr = new JSONObject ();
		pqr.put("firstName","Sanuja");
		pqr.put("lastName","Sane");
		pqr.put("address","pune");
		pqr.put("mobileNumber","98562371");
		
//convert json info into string variable to string()method
		String lmo = pqr.toString();
		
//use body()method from requestspecification object  by passing converted json object string variable
		abc.body(lmo);
		
//select the http put request from request specification object
		Response xyz = abc.put();
		
//Capture statuscode using getstatuscode() method
		int a = xyz.getStatusCode();
		System.out.println(a);
		
//capture statusline using getstatusline()method
		String b = xyz.getStatusLine();
		System.out.println(b);

		
//capture response time using StatusTime()method
		long c = xyz.getTime();
		System.out.println(c);

		
//Capture response body
		String d = xyz.getBody().asString();
		System.out.println(d);

	}

}
