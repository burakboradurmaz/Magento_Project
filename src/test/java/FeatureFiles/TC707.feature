Feature: Search Functionality

  Background: Common steps before each scenario
    Given The user navigates to the Magento website
    When User clicks the login button
    And The user types username and password and clicks on the login button
    Then The user should be logged in successfully

  Scenario: Search product by valid SKU code
    Given The user enters a valid SKU number "MJ08" and searches
    When The user finds the product they are looking for and clicks on it
    Then The user should verify that the correct product details are displayed

  Scenario: Search for product with invalid SKU code
    When The user enters an invalid SKU number "MJaf" and searches
    Then The user should see the "Your search returned no results." message