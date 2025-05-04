package capture;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class uploadfile {

	public static void main(String[] args) {
// configure base url into restassured
		RestAssured.baseURI = "http://postman-echo.com/post";
		
// get RequestSpecification interface
		RequestSpecification abc = RestAssured.given();
		
//use header method from requestSpecification object
		abc.headers("Content-Type", "multipart/form-data");
		
//create object of file class passing file location
		File src = new File("P:\\SoftwareTesting\\API Automation Testing\\Rest Assured\\Rest Assured class 7.txt");
		
////step 5: use multiPart() method by passing keyname and file instance name or object name
		abc.multiPart("file", src);
		
		//step 6; use post() method from RequestSpecification object
		Response response = abc.post();
		
////step 7; capture status code
		int a = response.statusCode();
		System.out.println(a);
		
////step 8: capture status line
		String b = response.statusLine();
		System.out.println(b);

		//step 9: capture resp time
		long c = response.time();
		System.out.println(c);
		
		
		//step 10: capture resp body
		String d = response.getBody().asString();
		System.out.println(d);
		
		//step 11: convert Response body into byte[] array
		byte[] ab= d.getBytes();
		
		//step 12: capture length of array
		int e = ab.length;
		System.out.println(e);
		
		
		//capture all headers
	    Headers allheader = response.headers();
	    
    //iterate all headers
	    for(Header cd: allheader)
	    {
			String f = cd.getName();
			System.out.println(f);
			
			String g  = cd.getValue();
			System.out.println(g);
		}
	    
		
		//ste 15: convert Headers object into String
		String pqr = allheader.toString();
		
		
		//step 16: convert String into byte [] array
		byte[] pq = pqr.getBytes();
		
		
		//step 17: capture length of array
		int s = pq.length;
		System.out.println(s);
		
		
		


	}

}
