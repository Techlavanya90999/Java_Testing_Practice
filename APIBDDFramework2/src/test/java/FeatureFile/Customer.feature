Feature:Test Customer All EndPoints using different HTTp Request

Background: * user set base uri


Scenario: create new customer
Given user set "customers" basepath
And user get Request Specification Interface object
And user create request payload for customer request payload post request
And user add customer payload to http requests
When user select http post requests 
Then user get Validate Response Interface Object
And user validate status code 201
And user validate status line "201 created"
And user validate response time below 5000 ms
And user validate response "Content-Type" and "application/JSON" header
And user validate response "Date" and "Jan 2025" header
And user generate res


