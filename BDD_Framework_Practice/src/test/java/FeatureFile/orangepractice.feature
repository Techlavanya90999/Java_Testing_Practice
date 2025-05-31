Feature: Test Facebook application

  Scenario: validate login functionality
    Given user should be on login page
    When user enter valid credentails
    Then user validate home page title
