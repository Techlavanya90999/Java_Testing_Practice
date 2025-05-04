Feature: Test Orange HRM application

  Scenario: Validate login Functionality
    Given User should be on login page
    When User enter valid credentials
    Then user validate home page titles
