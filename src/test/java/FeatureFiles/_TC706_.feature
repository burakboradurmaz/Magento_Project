Feature: Product order

Scenario: Product order
  Given Navigate to Homepage
  When The user selects a product from the homepage
  And Proceeds to checkout
  And User chooses shipping address and payment method and orders the product
  Then The user sees the success message with order number
