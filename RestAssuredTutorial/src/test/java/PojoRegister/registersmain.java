package PojoRegister;

import org.hamcrest.Matchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class registersmain {

	public static void main(String[] args) throws JsonProcessingException {
//configure base uri in rest assured
		RestAssured.baseURI="http://localhost:3000/registers";
		
//get requestspecification interface object
		RequestSpecification abc = RestAssured.given();
		
//add content type and application/json header
		abc.header("ContentType","Application/json");
		
//create object of user type class and set variables in setter method
		userType user = new userType();
		user.setGeneral(false);
		user.setSociety(true);
		
//create object of login class and set variables in setter method
		login lo = new login();
		lo.setUsername("lavanya12");
		lo.setPassword("1234");
		lo.setConfirmPassword("1234");
		
//create object of registers class and set variables in setter method
		registers regi = new registers();
		regi.setTitle("abc");
		regi.setName("Lavanya");
		regi.setSurname("D");
		regi.setPhone(12345);
		regi.setMobile("9854763210");
		regi.setLogin(lo);
		regi.setUserType(user);
		
//create object of object mapper
		ObjectMapper mapper =new ObjectMapper();
		
//convert jsva object into json of string by using writeValueAsString()method
		String requestPayload = mapper.writeValueAsString(regi);
		
//attach requestpayload to http request using body()method
		abc.body(requestPayload);
		
//use post method from request specification object
		Response response = abc.post();
		
//get validatableresponse interface object using then()method
		ValidatableResponse validateresponse = response.then();
		
//validate status code
		validateresponse.statusCode(Matchers.equalTo(201));
		
//Validate Status line
		validateresponse.statusLine(Matchers.containsString("created"));
		
//validate response time
		validateresponse.time(Matchers.lessThanOrEqualTo(2000l));
		
//validate content type header contains json value should be present by ignoring uppercase and lower case values
		validateresponse.header("Content-Type",Matchers.containsStringIgnoringCase("json"));
		
//validate name rohit present or not
		validateresponse.body("name",Matchers.equalTo("Lavanya"));
		
//validate username
		validateresponse.body("",Matchers.hasKey("username"));
		
//validate true
		validateresponse.body("",Matchers.hasEntry("general","false"));
		
		
		validateresponse.log().all();
		

		
		
		
		
		
	}

}
