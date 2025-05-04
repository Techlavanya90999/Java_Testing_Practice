package capture;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class captureheaders {

	public static void main(String[] args) {
		//configure base uri in rest assured
				RestAssured.baseURI = "http://localhost:3000/Employee/1";
		
		//get requestspecification interface object
				RequestSpecification abc = RestAssured.given();	
		
		//use get method from request specification object
				Response xyz = abc.get();
				
		//use headers method response object
				Headers pqr = xyz.headers();
				
		//iterate all headers value
				for(Header ab : pqr)
				{
				//captutre all headers key name
					String a = ab.getName();
					System.out.println(a);
					
		
					//step 7: capture all headers values
					String b = ab.getValue();
					System.out.println("   " +b);
					
				}
				
	}

}
