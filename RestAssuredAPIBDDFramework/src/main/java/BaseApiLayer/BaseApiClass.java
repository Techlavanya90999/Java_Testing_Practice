package BaseApiLayer;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseApiClass {
	protected static RequestSpecification httpRequest;
public static void reqspec() {
	httpRequest = RestAssured.given().contentType(ContentType.JSON).log().all();
}
}
