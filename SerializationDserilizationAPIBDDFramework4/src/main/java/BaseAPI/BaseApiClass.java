package BaseAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseApiClass {
	protected static RequestSpecification httprequest;
public static void reqSpec() {
httprequest = RestAssured.given().contentType(ContentType.JSON).log().all();
}
}
