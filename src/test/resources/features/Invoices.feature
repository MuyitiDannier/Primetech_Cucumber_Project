@Invoices
Feature: Invoices Feature
  As a user, I want to access and manage the invoices page.

  Background:
    Given user is navigated to Crater login page
    When user enters valid username and valid password
    And user click on login button
    Then user should be logged in successfully
    When user clicks on Invoices
    Then user should be navigated to the Invoices page

  Scenario: User should have access to the invoices and able to view the invoice details
    And user should see Invoices label should be displayed
    And user should see the pagination should be displayed as "Home/Invoices"
    When user clicks on pagination-next
    Then user should be directed to the next page
    When user clicks on pagination-previous
    Then user should be directed to the previous page
    When user clicks on a specific invoice
    Then user should see that the invoice details are displayed on the right side of the screen

  @AddNewInvoices
  Scenario: User should be able to add new invoices
    When user clicks on + New Invoice button
    Then user should be directed to the New Invoice page
    When user selects a specific client New Customer dropdown
    And user selects a specific item from Item dropdown
    And user enters "2" in the Quantity field
    And user enters "$ 4.99" in the Price field
    And user clicks on the Save Invoice button
    Then user should see the new invoice is listed in the invoices list
    And the invoice total should match the added items and their quantities

