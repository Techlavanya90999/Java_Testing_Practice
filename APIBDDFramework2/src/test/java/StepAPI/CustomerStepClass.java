package StepAPI;

import org.hamcrest.Matchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import BaseAPILayer.BaseAPIClass;
import ModelAPILayer.CustomerClass;
import ReaderAPILayer.PropertyReaderClass;
import groovy.beans.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class CustomerStepClass extends BaseAPIClass{
	String customerRequestPayload;
	Response response;
	ValidatableResponse validateResponse;
	static String customerId;

	
	@Given("set base uri")
	public void set_base_uri() throws Exception {

		RestAssured.baseURI = PropertyReader.getProperty("BASE_URI");

	}


	@Given("user set (String) base path")
	public void user_set_base_path(String basePath) 
	{
	    RestAssured.basePath = basePath;
	}

	@Given("user get Request Specification Interface object")
	public void user_get_Request_Specification_Interface_object() 
	{
		BaseAPIClass.Requespecification();
	}

	@Given("user create request payload for customer request payload post request")
	public void user_create_request_payload_for_customer_request_payload_post_request() throws JsonProcessingException 
	{
	    //create request body from pojo class
		//create object of pojo class
		CustomerClass customer = new CustomerClass();
		customer.setFullName("Priya Chaudhari");
		customer.setEmail("priya@gmail.com");
		customer.setPhone("9090909");
		customer.setGender(false);
		customer.setProduct_price(900.3f);
		customer.setCity("Pune");
		customer.setPincode(11223);
		customer.setState("MH");
		customer.setCountry("India");
		
		ObjectMapper mapper = new ObjectMapper();
		customerRequestPayload = mapper.writeValueAsString(customer);
		

	}

	@When("user add customer payload to http requests")
	public void user_add_customer_payload_to_http_requests() 
	{
	    httpRequest.body(customerRequestPayload);
	}

	@Then("user select http post requests ")
	public void user_select_http_post_requests () {
		Response response= httpRequest.post();
		
	   
	}

	@Then("user get Validate Response Interface Object")
	public void user_get_Validate_Response_Interface_Object()
	{
	   ValidatableResponse validateResponse = response.then().assertThat();
	}
	@Then("user validate status code {int}")
	public void user_validate_status_code(Integer code) {
		validateResponse.statusCode(Matchers.equalTo(code));
	}

	@Then("user validate status line {string}")
	public void user_validate_status_line(String line) {
		validateResponse.statusLine(Matchers.containsString (line));

	}
	

	@Then("user validate response time below {int} ms")
	public void user_validate_response_time_below_ms(Integer time) {
		validateResponse.time(Matchers.lessThan((long) time));

	}

	@Then("user validate response {string} and {string} header")
	public void user_validate_response_and_header(String keyName, String value) {
		validateResponse.header(keyName, Matchers.containsString(value));

	}

	@Then("user generate response logs")
	public void user_generate_response_logs() {
		validateResponse.log().all();

	}

}
