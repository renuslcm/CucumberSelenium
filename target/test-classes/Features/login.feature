@SmokeScenario
Feature: Login workflow
  Login workflow for 3 different kinds of users

  @smokeTest
  Scenario: Login to the application
    Given User enters username and password
    When Click login button
    Then The applicaiton is opened
  #@SmokeTest
  #Scenario Outline: Login to the application
    #Given User enters <username> and <password>
    #When Click login button
    #Then The applicaiton is opened
#
    #Examples: 
      #| username      | password  |
      #| bpl.feeearner | SHMA@1234 |
      #| bpl.partner   | SHMA@1234 |
      #| bpl.admin     | SHMA@1234 |
