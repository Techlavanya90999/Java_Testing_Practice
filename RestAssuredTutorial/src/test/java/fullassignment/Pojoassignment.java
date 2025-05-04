package fullassignment;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import tutorialpojo.Customer;

public class Pojoassignment {

	public static void main(String[] args) throws JsonProcessingException {
		// step 1: configure base URI
		RestAssured.baseURI = "http://localhost:3000/Employee";

//Step 2: get the RequestSpecification interface object using RestAssured.given() method
		RequestSpecification abc = RestAssured.given();

//Step 3: add request Content-Type and application/json header
		abc.header("Content-Type", "application/json");

//step 4: create object of Customer POJO classes
		tutorialpojo.Customer ab = new Customer();
			ab.setLname("Hello");
			ab.setLname("World");
	}

}
