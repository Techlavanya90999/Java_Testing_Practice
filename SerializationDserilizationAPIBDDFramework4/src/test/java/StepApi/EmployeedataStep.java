package StepApi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hamcrest.Matchers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import BaseAPI.BaseApiClass;
import Endpoint.EmployeedataEndpoints;
import Model.EmployeeClass;
import Reader.JSONReaderClass;
import Reader.PropertyReaderClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class EmployeedataStep extends BaseApiClass {
	Response response;
	static String employeedataId;
	ValidatableResponse validateResponse;

	@Given("configure base uri")
	public void configure_base_uri() {
		RestAssured.baseURI = PropertyReaderClass.getProperty("BASE_URI");
	}

	@Given("get the request specification interface object")
	public void get_the_request_specification_interface_object() {
		BaseApiClass.reqSpec();

	}

	@Given("attach employee data request payload to http request")
	public void attach_employee_data_request_payload_to_http_request() throws Exception {

//		ObjectMapper mapper = new ObjectMapper();
//		String path = System.getProperty("user.dir") + "/src/test/resources/JsonPayload/employeedatapayload.json";
//		FileReader file = new FileReader(path);
//		JsonNode jsonNode = mapper.readTree(file);
//
//		Employeedata employeedata = mapper.treeToValue(jsonNode.get("createemployee"), Employeedata.class);
//
//		String employeedataPayload = mapper.writeValueAsString(employeedata);
		
		EmployeeClass employeedata = JSONReaderClass.deserialization("createemployee");
		
		String employeedataPayload = JSONReaderClass.serialization(employeedata);
		
		httprequest.body(employeedataPayload);
	}

	@When("crate new employee data using post request")
	public void crate_new_employee_data_using_post_request() {
		response = httprequest.when().post(EmployeedataEndpoints.POST_EMPLOYEE);

	}

	@Then("capture id from response payload")
	public void capture_id_from_response_payload() {
		employeedataId = response.jsonPath().getString("id");

	}

	@Then("get the validatable response interface object")
	public void get_the_validatable_response_interface_object() {
		validateResponse = response.then().assertThat();

	}

	@Then("validate status code {int}")
	public void validate_status_code(Integer code) {
		validateResponse.statusCode(Matchers.equalTo(code));
	}

	@Then("validate status line {string}")
	public void validate_status_line(String line) {
		validateResponse.statusLine(Matchers.containsString(line));
	}

	@Then("validate response time below {int} ms")
	public void validate_response_time_below_ms(Integer time) {
		validateResponse.time(Matchers.lessThan((long) time));
	}

	@Then("validate {string} and {string} response header")
	public void validate_and_response_header(String key, String value) {

		validateResponse.header(key, Matchers.containsString(value));
	}

	@Then("validate {string} and current month year reponse header")
	public void validate_and_current_month_year_reponse_header(String key) {
		String date = new SimpleDateFormat("MMM yyyy").format(new Date());

		validateResponse.header(key, Matchers.containsString(date));
	}

	@Then("validate employee data response schema")
	public void validate_employee_data_response_schema() throws FileNotFoundException {
		String path = System.getProperty("user.dir") + "/src/test/resources/JsonSchema/employeedataschema.json";
		FileReader file = new FileReader(path);

		validateResponse.body(JsonSchemaValidator.matchesJsonSchema(file));
	}

	@Then("generate response logs")
	public void generate_response_logs() {
		validateResponse.log().all();
	}

	
}

