@CustomerAPI
Feature: Test Customer all endpoints

Background: 
* Configure base URI

Scenario: create new customer using post request
Given: get request specification object
And Attach customer request payload to http request
When select http post request to create customer
Then capture id from response payload
And validate status code 201
And validate status line "created"
And validate response time below 500 ms
And validate "Content-Type" and "application/JSON" response header
And validate "Date" and current month and year response year
And validate customer json schema
And generate logs



