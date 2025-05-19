Feature: Product order

  Scenario: Product order
    Given Navigate to Homepage
    When The user selects a product from the homepage
    And Proceeds to checkout
    And User chooses shipping address and payment method and orders the product
    Then The user sees the success message with order number
  Scenario: Product order
    Given Navigate to Homepage
    When The user click on the element in Dialog
      | item                |
      | size                |
      | color               |
      | addToCartButton     |
      | myCartButton        |
      | checkOutButton      |
      | shippingMethodRadio |
      | nextButton          |

    Then The user should be to see the successMessage