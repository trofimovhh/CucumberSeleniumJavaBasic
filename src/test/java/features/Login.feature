Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page of an application
    And I enter username and password
      | username | password |
      | name     | pass     |
    And I click login button
    Then I should see the userform page