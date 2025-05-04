Feature: Test All Employee
Background:
			* user set the Base URI

Scenario: Retrieve Employee Entity

		Given user set "employees" base path 
		And user get the Request Specification interface object
		And user add employee path parameter
		When user select http get Request to retrieve single entity
		Then user get the Validatable response interface
		And user validate status code as 200
		And user validate status line as "200 OK"
		And user validate response time is below 5000 ms
		And user generate response logs