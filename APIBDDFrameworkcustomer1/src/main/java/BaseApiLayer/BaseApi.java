package BaseApiLayer;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

;

public class BaseApi {

	protected static RequestSpecification httpRequest;

	public static void reqSpec() {
		// get Request Specification object
		httpRequest = RestAssured.given();

		// add content type header
		httpRequest.header("Content-Type","application/json");
	

		// generate request logs
		httpRequest.log().all();

	}

}

