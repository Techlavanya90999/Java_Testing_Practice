package StepAPI;

import org.hamcrest.Matchers;

import BaseApiLayer.BaseAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class EmployeeStep extends BaseAPI {
	Response response;
	ValidatableResponse validateResponse;

	@Given("user set the Base URI")
	public void user_set_the_base_uri() {
		RestAssured.baseURI = "http://localhost:3000/";

	}
	@Given("user set {string} base path")
	public void user_set_base_path(String basePath) {
		RestAssured.basePath = basePath;
	}
	@Given("user get the Request Specification interface object")
	public void user_get_the_request_specification_interface_object() {
		BaseAPI.reqSpec(); 
	}
	@Given("user add employee path parameter")
	public void user_add_employee_path_parameter() {

	}
	@When("user select http delete Request to delete single entity")
	public void user_select_http_delete_request_to_delete_single_entity() {
		response = httpRequest.delete("{id}");

	}
	@Then("user get the Validatable response interface")
	public void user_get_the_validatable_response_interface() {
		validateResponse = response.then().assertThat();
	   
	}
	@Then("user validate status code as {int}")
	public void user_validate_status_code_as(Integer code) {
		validateResponse.statusCode(Matchers.equalTo(code));

	}
	@Then("user validate status line as {string}")
	public void user_validate_status_line_as(String line) {
		validateResponse.statusLine(Matchers.containsString(line));
	}
	@Then("user validate response time is below {int} ms")
	public void user_validate_response_time_is_below_ms(Integer time) {
		validateResponse.time(Matchers.lessThan((long) time));

	}
	@Then("user generate response logs")
	public void user_generate_response_logs() {
		validateResponse.log().all();

	}
	
	
	

}

