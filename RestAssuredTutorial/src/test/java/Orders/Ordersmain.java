package Orders;

import org.hamcrest.Matchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Ordersmain {

	public static void main(String[] args) throws JsonProcessingException {
//configure baseuri in RestAssured
		RestAssured.baseURI = "http://localhost:4000/orders";
		
//Get Request Specification interface object
		RequestSpecification abc = RestAssured.given();
		
//add content type and application/json header
		abc.header("Content-Type","Application/json");
		
//create object of OpeningHours class and set values for variables using setter()method
		OpeningHours open = new OpeningHours();
		open.setWeekday("Tuesday");
		open.setFrom("09:00:00");
		open.setTo("17:00:00");
		
//create object of Coordinate class and set values for variables using setter()method 
		Coordinates cordi = new Coordinates();
		cordi.setLatitude(21.69935);
		cordi.setLongitude(23.53046);
		
//create object of Address class and set values for variables using setter()method
		Address add = new Address();
		add.setStreetName("Anusya");
		add.setHouseNumber("21");
		add.setHousePostfix("A");
		add.setPostalCode("1234");
		add.setCity("Pune");
		add.setCountry("India");
		add.setCoordinates(cordi);
		
//create object of client class and set values for variables using setter()method
		Client cl = new Client();
		cl.setContactName("Ankita");
		cl.setPhone("123456");
		cl.setCompanyName("Info");
		cl.setOpeningHours(open);
		cl.setAddress(add);
		cl.setExtraTime("31");
		
//create object of ActivityInfotexts class and set values for variables using setter()method
		ActivityInfotexts act = new ActivityInfotexts();
		act.setKey("Region IF");
		act.setValue("DK_1253FV");
		
//create object of BasicPlan class and set values for variables using setter()method
		BasicPlan basic = new BasicPlan();
		basic.setResource("John_DI");
		basic.setResourceType("Security");
		basic.setTrip("TestTrip2");
		basic.setTime("2020-03-17 08:40:00");
		basic.setPickupTerminal("CPM_Terminal");
		basic.setDeliveryTerminal("CPH_Terminal");
		basic.setSequenceNumber(2);
		
//create object of OrderInfotexts class and set values for variables using setter()method
		OrderInfotexts order = new OrderInfotexts();
		 order.setKey("Region IM");
		 order.setValue("DK_1253RT");
		 
//create object of Orders class and set values for variables using setter()method
		 Orders main = new Orders();
		 main.setOrderLineID("OrderLineID");
			main.setCustomerId("John_DI");
			main.setName("abc");
			main.setServiceCode("Collect");
			main.setOrderComment("This is a order create");
			main.setActivityComment("This is a activity create");
			main.setOrganizationCode("ODGA_CODE");
			main.setRestrictOnOrganisationCode(true);
			main.setIsUnrestricted(false);
			main.setPriority(2);
			main.setContainerType("bin5m4");
			main.setNumberOfBins(5);
			main.setOrderedDateFrom("2021-03-10");
			main.setOrderedDateTo("2021-03-15");
			main.setTrucks(null);
			main.setClient(cl);
			main.setOrderInfotexts(order);
			main.setActivityInfotexts(act);
			main.setBasicPlan(basic);
			
//create object of ObjectMapper and convert java object into the JSON of String by uisng writeValueAsString() method
			ObjectMapper mapper =new ObjectMapper();
			String requestPayload = mapper.writeValueAsString(main);
			
//attach request payload to http request using body() method by passing converted JSON String variablename
			abc.body(requestPayload);
			
//use post() method from requestSpecification object
			Response response = abc.post();
			
//get the ValidatableResponse interface object using then()  method
			ValidatableResponse validateResponse = response.then();
					//assertThat();
			
//validate status code
			validateResponse.statusCode(Matchers.equalTo(201));
			
//validate status line
			validateResponse.statusLine(Matchers.containsString("201 Created"));
			
//validate response time
			validateResponse.time(Matchers.lessThanOrEqualTo(2000l));
			
//validate Content-Type header contains json value should be present by ignoring UP and LC values
			validateResponse.header("Content-Type", Matchers.containsStringIgnoringCase("json"));
			
			//validate OrderComment
			validateResponse.body("", Matchers.hasKey("serviceCode"));
//validate John
		//	validateResponse.body("client.address.houseNumber",Matchers.equalTo("61"));
//validate weekdays

			//validateResponse.body("client.openingHours.weekday",Matchers.equalTo("Tuesday"));
//validate city
			//validateResponse.body("client.address.city",Matchers.equalTo("CityName"));
//validate Resource
			//validateResponse.body("resource",Matchers.equalTo(basic.getResource()));
			validateResponse.body("",Matchers.hasEntry("isUnrestricted",false));
			//validateResponse.body("orderInfotexts.key",Matchers.equalToIgnoringCase("comp_id1"));
			
			//generate logs
			validateResponse.log().all();
			
			
		
	}

}
