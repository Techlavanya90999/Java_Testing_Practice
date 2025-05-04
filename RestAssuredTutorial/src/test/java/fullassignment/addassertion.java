package fullassignment;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class addassertion {

	public static void main(String[] args) {
//configure base url into rest assured
		RestAssured.baseURI = "http://localhost:3000/bakers/0001";
		
//get the resquestspecification interface object
		RequestSpecification abc = RestAssured.given();
		
//use get method from request specification object
		Response xyz = abc.get();
		
//get the validatableResponse interface object using then()method
		ValidatableResponse pqr = xyz.then();
		
//add assertion for status code
		pqr.statusCode(Matchers.equalTo(200));
		
//add assertion for status line
		pqr.statusLine(Matchers.containsString("200 OK"));
		
//add assertion for status time
		pqr.time(Matchers.lessThan(2000l));
		
//verify cake value present or not
		pqr.body("", Matchers.hasValue("Cake"));
		
//verify blueberry present or not
		pqr.body("batters.batter[2]",Matchers.hasEntry("type","Blueberry"));
		
//verify Powdered Sugar present or not
		pqr.body("topping[3]", Matchers.hasEntry("type", "Powdered Sugar"));
		
//verify key present or not
		pqr.body("topping[1]",Matchers.hasKey("type"));
		

		
		pqr.log().all();
}
}