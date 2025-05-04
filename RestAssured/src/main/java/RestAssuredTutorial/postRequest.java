package RestAssuredTutorial;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postRequest {

	public static void main(String[] args) {
//create object of json body class
		JSONObject json = new JSONObject();
		//add test data
		json.put("firstName","Mayuresh");
		json.put("lastName","Devanpalli");
		json.put("address","Sinnar");
		json.put("mobileNumber", "99601767979");
		
		//convert json object into string object
		String requestBody = json.toString();
		
		//set the bse uri
		RestAssured.baseURI="http://localhost:3000/employees";
		//get request specification object
		RequestSpecification httpRequest = RestAssured.given();
		//add content-Type request header
		httpRequest.header("Content-Type","application/json");
		//add request body to http post request
		httpRequest.body(requestBody);
		//select http post request from request specification object
		Response resp = httpRequest.post();
		//capture status code
		System.out.println(resp.getStatusCode());
		//capture statusline
		System.out.println(resp.getStatusLine());
		//capture response time
		System.out.println(resp.getTime());
		//capture response header
		Headers allheader = resp.getHeaders();
		for(Header header:allheader) {
			System.out.println(header.getName()+""+header.getValue());
		}
		//capture response body
		System.out.println(resp.getBody().asPrettyString());
	}

}
