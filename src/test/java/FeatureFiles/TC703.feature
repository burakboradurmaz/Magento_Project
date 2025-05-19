Feature: Address Functionality

  Background:
    Given Navigate to Magento
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Create an address
    Given Navigate to My Account
    And Navigate to Address Book

    When Write the phone number as "<number>"
    And Select the country
    And Write street address as "<street>"
    And Write city as "<city>"
    And Write postal code as "<postalCode>"
    And Click the save button
    Then Success message should be displayed

    Examples:
      | number      | street            | city     | postalCode |
      | 05052589632 | Mehmet Akif Ersoy | İstanbul | 34000      |
      | 05342023232 | Necip Fazıl       | Ankara   | 34000      |
      | 05051234567 | Hasan Ali         | Aksaray  | 34000      |


  Scenario: Edit an address
    Given Navigate to My Account
    And Navigate to Address Book
    When Click the edit button on an existing address
    And Success message should be displayed


  Scenario: Delete an address
    Given Navigate to My Account
    And Navigate to Address Book
    When Click the delete button on an existing address
    And Success message should be displayed

