package RestAssuredJava;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTesting {
public void PerformGetRequest(int expectedStatusCode) {
	RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		//send get request and capture Response
    Response response = given()
            .log().all() // Log the request details
        .when()
            .get("/posts/1") // Example endpoint
        .then()
            .log().all() // Log the response details
            .extract().response();
	System.out.println("Start Assertion");
	//Assert status code
	int ActualStatusCode = response.getStatusCode();
	assert ActualStatusCode == expectedStatusCode : "Expected Status: " + expectedStatusCode + ", but got: " + ActualStatusCode;
	
	 // Assert Response Time
	long ResponseTime = response.getTime();
	assert ResponseTime < 2000 : "Response Time is too high: " + ResponseTime + "ms: ";
	
	 // Assert Content-Type Header
    String contentType = response.getHeader("Content-Type");
    assert contentType.contains("application/json") : "Unexpected Content-Type: " + contentType;

    // Assert Body contains expected keys
    String userId = response.jsonPath().getString("userId");
    String title = response.jsonPath().getString("title");

    assert userId != null : "userId key not found!";
    assert title != null : "title key not found!";
    
    //logs
    System.out.println("Status Code: " + ActualStatusCode);
    System.out.println("Response Time: " + ResponseTime + "ms" );
    System.out.println("Content Type: " + contentType);
    System.out.println("Response Body: " + response.getBody().asPrettyString());
    System.out.println("Assertion End");
}
    public static void main(String[] args) {
        ApiTesting api = new ApiTesting();
        api.PerformGetRequest(200); // Expecting HTTP 200 OK
    }
}

