Feature: User Register

  Scenario: User Registration Successfully
    Given Navigate to Magento Website
    When Click on Create an Account for user registration
    And User Should Be Form is Displayed
    And User Fills The Registration From With Valid Data
      | FirstName       | Team5          |
      | LastName        | Techno         |
      | Email           | team5@gmail.com|
      | Password        | TeamFive5*     |
      | ConfirmPassword | TeamFive5*     |
    And User Click on Create an Account Button
    Then User Should See the Message Registration Successfully
    And User Click on DropDown Menu
    Then User Logs Out by Click on the Sign Out

