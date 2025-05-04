@EmployeedataStep
Feature: Test employee data all endpoints
Background: * configure base url
Scenario: Create new employee data using post request

Given set employee data base path
And get the request specification interface object
Given attach employee data request payload to http request
And read employee data from json file & convert to json string
When create new employee data using post request
Then capture id from response interface object
And validate status code 201
And validate statusline "Created"
And validate response time below 5000 ms
And Val;idate "content type" and "Application/json" response header
And validate "Date" & Curent month year response header
And validate employee data response schema
And generate Response Logs
