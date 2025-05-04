package practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {

	public static void main(String[] args) {
RestAssured.baseURI = "http://localhost:3000/employees/2";
RequestSpecification abc = RestAssured.given();
Response xyz = abc.delete();
//capture status code
int a = xyz.getStatusCode();
System.out.println(a);
//capture statusline
String b = xyz.getStatusLine();
System.out.println(b);
//capture Response time
long c = xyz.getTime();
System.out.println();
//captyre response body
String d = xyz.getBody().asString();
System.out.println(d);


	}

}
