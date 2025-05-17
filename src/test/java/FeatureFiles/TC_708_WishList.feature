Feature: Wish List
  Background:
    Given Navigate to Magento Website
    And   Click Sign In button
    When  Enter username that as "team5@gmail.com" and password that as "TeamFive5*"
    And   Verify that Welcome message is displayed


  Scenario: Add and remove product from wish list

    Given The user is on the product page of an item he likes
    When  Click on the My Wish List link
    Then  Verify that the product is added to the wish list

    When  Navigate to the My Account page
    And   Click on the My Wish List link again
    Then  Verify that the product is in the wish list

    When  The user hovers over "the product"
    Then  The Remove from Wish List icon appears and click
    And   Verify that the product is removed from the wish list
