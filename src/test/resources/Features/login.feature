@SmokeScenario
Feature: Login workflow
  Login workflow for 3 different kinds of users

  @SmokeTest
  Scenario: Login to the application
    Given Open chrome browser
    And Launch the application
    Given User enter username and password
    When Click login button
    Then The applicaiton is opened
    And Validate the tasks
    And Log out from the application

  @SmokeTest1
  Scenario Outline: Login to the application
    Given Open chrome browser
    Given Launch the application
    Given User enters <username> and <password>
    When Click login button
    Then The applicaiton is opened
    And Log out from the application

    Examples: 
      | username      | password  |
      | bpl.feeearner | SHMA@1234 |
      | bpl.partner   | SHMA@1234 |
      | bpl.admin     | SHMA@1234 |
