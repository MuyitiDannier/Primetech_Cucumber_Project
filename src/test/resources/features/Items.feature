Feature: Items Feature
  As a user, I want to be able to manage the items

  Background:
    Given user is navigated to Crater login page
    When user enters valid username and valid password
    And user click on login button
    Then user should be logged in successfully

  Scenario: User should be able to manage the items
    When user click on Items
    Then user should be navigated to the Items page
    When user click on + Add Item
    Then user should be navigated to New Item Page
    And New Item fields should be displayed.
    When user enters "New Item" into the Name field
    And user enters price "12.99" into the Price field
    And user chooses item unit "grams" in the Unit List
    And user enter "This item is new." into the Description field
    And user clicks on the Save Item button
    Then user should be able to see that the new item is listed in the items table

