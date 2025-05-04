package BaseAPILayer;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseAPIClass {
	//store globally RequestSpecification
	protected static RequestSpecification httpRequest;

	public static void Requespecification() {
		// get Request Specification object
		httpRequest = RestAssured.given();

		// add content type header
		// httpRequest.header("Content-Type","application/json");
		httpRequest.contentType(ContentType.JSON);

		// generate request logs
		httpRequest.log().all();
}
}
