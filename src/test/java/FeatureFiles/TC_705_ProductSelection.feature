Feature: Product Selection
  Scenario: Add and Remove Item
    Given Navigate to Magento Website
    And The Button Should Be Clickable
    And Click on The SignIn Button
    When Enter Email as "team5@gmail.com" and Password as "TeamFive5*"
    And Click SignIn Button
    And The Button Should Be Displayed
    Then User Should Select a Product
    And Add to Cart Button Should be Clickable
    Then Select Size, Color and Qty
    And Add to Cart Button Should be Clickable
    And Click Add Item To Cart
    And Addition Success message should be displayed
    Then Click To Cart
    And Click To View and Edit Cart
    Then Remove Item
    And Click Here to Continue Shopping
    Then User Should New Select a Product
    And Add to Cart Button Should be Clickable
    Then Select new Size, new Color and new Qty
    And Add to Cart Button Should be Clickable
    And Click Add Item To Cart Again
    Then Click To Cart Again
    And Click To View and Edit Cart Again
    Then Edit Product
    And Increase qty
    And Update Cart Button Should Be Clickable
    And Click on Update Cart
    And And Success message should be displayed