Feature: Product order

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
