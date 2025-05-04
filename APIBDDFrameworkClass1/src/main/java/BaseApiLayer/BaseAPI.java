package BaseApiLayer;

import org.apache.http.entity.ContentType;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


public class BaseAPI {

	protected static RequestSpecification  httpRequest;

	public static void reqSpec() {
		// get Request Specification object
		httpRequest = RestAssured.given();

		// add content type header
		httpRequest.header("Content-Type","application/json");

		// generate request logs
		httpRequest.log().all();

	}

}

