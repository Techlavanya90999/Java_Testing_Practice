package Reader;

import java.io.FileReader;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Model.EmployeeClass;
import Model.EmployeedataClass;

public class JSONReaderClass {

	public static EmployeeClass deserialization(String jsonNodeName) {
		String path = System.getProperty("user.dir") + "/src/test/resources/JsonPayload/employeedatapayload.json";

		try {
			FileReader file = new FileReader(path);

			ObjectMapper mapper = new ObjectMapper();
			JsonNode jsonNode = mapper.readTree(file);

			return mapper.treeToValue(jsonNode.get(jsonNodeName), Employeedata.class);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String serialization(EmployeeClass employeedata) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(employeedata);

	}

}

