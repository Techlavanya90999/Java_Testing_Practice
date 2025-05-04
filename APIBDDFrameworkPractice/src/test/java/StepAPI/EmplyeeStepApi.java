package StepAPI;

import org.hamcrest.Matchers;

import APIBaselayer.BaseAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class EmplyeeStepApi extends BaseAPI{
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
		BaseAPI.Requespecification();
	}

	@Given("user add employee String as path parameter")
	public void user_add_employee_path_parameter(String employeeId) {
		httpRequest.pathParam("id", employeeId);

	}

	@When("user select http get Request to retrieve single entity")
	public void user_select_http_get_request_to_retrieve_single_entity() {
	    
	}

	@Then("user get the Validatable response interface")
	public void user_get_the_validatable_response_interface() {
		validateResponse = response.then().assertThat();
	}

	@Then("user validate status code as {int}")
	public void user_validate_status_code_as(Integer int1) {
		ValidateResponse.statusCode(Matchers.equalTo(code));

	}

	@Then("user validate status line as {string}")
	public void user_validate_status_line_as(String string) {
		validateResponse.statusLine(Matchers.containsString(line));

	}

	@Then("user validate response time is below {int} ms")
	public void user_validate_response_time_is_below_ms(Integer int1) {
		validateResponse.time(Matchers.lessThan((long) time));

	}

	@Then("user generate response logs")
	public void user_generate_response_logs() {
		validateResponse.log().all();
	}

	
	
	
