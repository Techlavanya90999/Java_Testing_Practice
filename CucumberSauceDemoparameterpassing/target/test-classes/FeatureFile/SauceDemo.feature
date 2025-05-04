Feature: Test Sauce Demo application

  Scenario: validate Login Functionality
    Given user is on login page
    When user enter valid username as "standard_user" and password as "secret_sauce"
    Then user click on login button

  Scenario: Validate Product page Functionality
    Given: user is on product page
    When user select high to low price products
    And user add 5 products to cart
    Then user click on container button
    And user click on checkout button

    Scenario: validate personal details functionality
    When user enter "Lavanya" firstname and "D" lastname and "411014" pincode
    And user click on continue button
    And user click on finish button