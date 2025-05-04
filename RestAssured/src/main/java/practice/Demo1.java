package practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
RestAssured.baseURI = "http://localhost:3000/employees";
RequestSpecification abc = RestAssured.given();
//Select the HTTP GET Request from RequestSpecification Object
Response xyz = abc.get();
//capture status code using getStatusCode() method
int a = xyz.getStatusCode();
System.out.println(a);
//capture ststus line
String b = xyz.getStatusLine();
System.out.println(b);
//capture Response time
long c = xyz.getTime();
System.out.println(c);
//capture response body
String d = xyz.getBody().asString();
System.out.println(d);
	}

}
