package capture;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class uploadfileinrestassured {

	public static void main(String[] args) {
//configure base uri in restassured
		RestAssured.baseURI = "http://postman-echo.com/post";
		
//get request specification interface object
		RequestSpecification abc = RestAssured.given();
		
//use get()method from requestspecification object by passing "contet-type" and "multiparts from data"
		abc.header("content-type","multipart/form-data");
		
//create object of file class by passing filelocation
		File src = new File("C:\\Users\\mayur\\Downloads\\Rest Assured class 7.txt");
		
//use multipart()method by passing file keyname & file instance or object name to http request
		abc.multiPart("file",src);
		
//use post()method fromrequest specification object
		Response response = abc.post();
		
//capture status code
		int a = response.statusCode();
		System.out.println(a);
		
//capture status line
		String b = response.statusLine();
        System.out.println(b);
        
//capture rest time
       long c = response.time();
       System.out.println(c);
       
//capture response body
       String d = response.body().asString();
       System.out.println(d);

       
//convert Response body into byte[] array
		byte[] ab= d.getBytes();
		
//capture length of array
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
	    
//convert headers object into string using tostring()method
	    String pq = allheader.toString();
	   
//convert string into byte[]
	    byte[] mn = pq.getBytes();
	    
//capture length or size or array
	    int f = mn.length;
	    System.out.println(f);

	    
	    


        
		
		
		
	}

}
