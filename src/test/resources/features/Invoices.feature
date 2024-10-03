Feature: Invoices Feature
  As a user, I want to have access to the invoices

  Background:
    Given user is navigated to Crater login page
    When user enters valid username and valid password
    And user click on login button
    Then user should be logged in successfully

  Scenario: User should have access to the invoices and able to view the invoice details
    When user clicks on Invoices
    Then user should be navigated to the Invoices page
    And user should see Invoices label should be displayed
    And user should see the pagination should be displayed as "Home/Invoices"
    When user clicks on pagination-next
    Then user should be directed to the next page
    When user clicks on pagination-previous
    Then user should be directed to the previous page
    When user clicks on a specific invoice
    Then user should see that the invoice details are displayed on the right side of the screen