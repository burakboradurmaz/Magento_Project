Feature: Login Functionality

  Background:
    Given Navigate to the website
    And Click on the signIn button

  Scenario: Valid Login Test
    When Enter valid username as "batch7team5@gmail.com" and password as "1q2w3e4raA."
    And Click on the login button
    Then The user should be logged successfully

  Scenario: Login with null email
    Given User enters the correct password
    When Click on the login button
    Then The user should be to see the email error message

  Scenario: Login with incorrect email
    Given User enters invalid email and  the correct password
    When Click on the login button
    Then The user should be to see the incorrect Error message


  Scenario: Login with null password
    Given User enters the correct email
    When Click on the login button
    Then The user should be to see the incorrect Error message


  Scenario: Login with incorrect password
    Given User enters valid email and  the invalid password
    When Click on the login button
    Then The user should be to see the password error message








