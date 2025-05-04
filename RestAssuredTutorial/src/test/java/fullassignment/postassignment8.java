package fullassignment;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postassignment8 {

	public static void main(String[] args) {
//configure base uri in rest assured
		RestAssured.baseURI = "http://localhost:1212/Employee";
		
//get requestspecification interface object using rest assured
		
		RequestSpecification abc = RestAssured.given();
		
//use header () from using requestspecification object by passing content type key nameand application/json value
		abc.header("content-type","application/json");
		
//create requestbody using json object class
		//create object of json object class
		JSONObject pqr = new JSONObject();
		
		//use put method from json object class by passing keyname and value
		pqr.put("firstname", "Anjali");
		pqr.put("lastname", "Patil");
		pqr.put("address", "pune");
		pqr.put("mobileNumber", "9865745612");
		
		//convert json object into string format using to string()method
		String lmo = pqr.toString();
		
//use body method from request specificstion object by passing converted string requested body
		abc.body(lmo);
		
//select post method from using request specification object
		Response xyz = abc.post();
		
//capture statuscode using get statuscode()method or status code method
		int a = xyz.getStatusCode();
		System.out.println(a);
		
//capture statuscode using get statusline()method or status line method
		String b = xyz.getStatusLine();
		System.out.println(b);
		
//capture response time using response time()method
		long c = xyz.getTime();
		System.out.println(c);
		
//capture response body using getBody().asString()method or body().asString()method
		String d = xyz.getBody().asString();
		System.out.println(d);
		
		//convert string into bytes[] arrays
		byte[]cd = d.getBytes();
		
		//capture length of array
		int g = cd.length;
		System.out.println(g);
		
//use get headers() to capture all headers
		Headers lmn = xyz.getHeaders();
		
//itrate all headers using enhance loop
		for (Header ab:lmn)
		{
		//use get name method to capture all headers
			String e = ab.getName();
			System.out.println(e);
			
			//use get value method to capture all values
			String f = ab.getValue();
			System.out.println(f);

		}
		
		
		//convert headers into string format using toString()method
		String ab = lmn.toString();
		
		//convert String into byte [] array using getBytes() method
		byte []  lm = ab.getBytes();
		
		//capture size or length of array using length property

		int h = cd.length;
		System.out.println(h);


	}

}
