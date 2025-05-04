@Registers
Feature: Test Register all Endpoints using different HTTP Request


Background:
			* user set the Base URI

Scenario: Retrieve Register Entity

		Given user set "Registers" base path 
		And user get the Request Specification interface object
		And user add Register id path parameter
		When user select http get Request to retrieve single entity
		Then user get the Validatable response interface
		And user validate status code as 201
		And user validate status line as "200 OK"
		And user validate response time is below 5000 ms
		And user generate response logs
