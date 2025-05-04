package Practice;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postrequest {

	public static void main(String[] args) {
//configure base uri into RestAssured using RestAssured.baseURI = "actualuri"
		RestAssured.baseURI=  "http://localhost:3000/employees";
		
//get RequestSpecification interface object using RestAssured.given()method
		RequestSpecification abc = RestAssured.given();
		
//use header method from using request specification object by passing content-Type key name and application/json
		abc.header("Content-Type","application/json");
		
//create request body by using json object class
		//create object of json boject class
		JSONObject pqr = new JSONObject();

        //use put method by passing key name and value
		pqr.put("firstName","Raju");
	    pqr.put	("lastName","Patil");
		pqr.put	("address","Pune");
		pqr.put	("mobileNumber",909090);
		
		//conver json object into string format
		String lmo = pqr.toString();
		
//use body()method from request specification object by passingconverted string request body
		abc.body(lmo);
		
//select post method from request specificstion object
		Response xyz= abc.post();
		
// capture status code using getststatus ()method
		int a = xyz.getStatusCode();
		System.out.println(a);

//capture Status line using getStatusline() method
		String b = xyz.getStatusLine();
		System.out.println(b);
		
//capture response time using gettime() method
		long c = xyz.getTime();
		System.out.println(c);
		
	}

}
