package RestAssuredTutorial;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequest {

	public static void main(String[] args) {
		// Set the base uri
		RestAssured.baseURI = "http://localhost:3000/employees/1";
		// get the request specification object
		RequestSpecification httpRequest = RestAssured.given();
//selct http get request
		Response resp = httpRequest.get();
		//capture status code from response object
		System.out.println(resp.getStatusCode());
		System.out.println(resp.statusCode());
		//Capture Status line
		System.out.println(resp.getStatusLine());
		System.out.println(resp.statusLine());
		//capture response time
		System.out.println(resp.getTime());
		System.out.println(resp.time());
		//capture response body
		System.out.println(resp.getBody().asString());
		System.out.println(resp.body().asString());
		//capture response headers
		Headers allheader=resp.getHeaders();
for(Header abc:allheader) {
	System.out.println(abc.getName()+"::"+abc.getValue());
	}
}

}
