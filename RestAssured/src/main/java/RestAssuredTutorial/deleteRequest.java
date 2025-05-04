package RestAssuredTutorial;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteRequest {

	public static void main(String[] args) {
//set base uri
		RestAssured.baseURI = "http://localhost:3000/employees/d7b2";
		
		//get request specification object
		RequestSpecification httpRequest = RestAssured.given();
		
		//select http get request 
		Response resp = httpRequest.delete();
		
		//capture status code
		System.out.println(resp.getStatusCode());
		System.out.println(resp.statusCode());

		
		//capture statusline
		System.out.println(resp.getStatusLine());
		System.out.println(resp.statusLine());

		
		//capture response time
		System.out.println(resp.getTime());
		System.out.println(resp.time());
		
		//capture Response header
		Headers allheader = resp.getHeaders();
		
		for (Header abc:allheader) {
			System.out.println(abc.getName()+"::"+abc.getValue());
			
		}
	}

}
