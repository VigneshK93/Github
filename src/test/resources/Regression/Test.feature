Feature: To validate facebook login function

  Scenario: To validate login function using valid username and valid password
    Given User launches the browser and navigate to facebook app
    When User enter the login credentials in facebook app
    When User login into facebook
    Then User validates the error message

  