Feature: Test Orange HRM application

  Scenario: Validate login Functionality
    Given User should be on login page
    When user enter valid credentials
    Then user validate home page Title
