Feature: 
Scenario: validate login functionality

Given User should be on login page

When User enter valid credentials

Then User validate homeapge title

Scenario: add employee on PIM page

Given user is on PIM page
And user click on add employee button
When user enter valid credentials
Then user click on save button

Scenario: Add employee more details

Given 
