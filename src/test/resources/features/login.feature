@Saucedemo
Feature: Login feature
  As a user I should be able to verify that login is working as expected
  @smoke
  Scenario: User can login using valid username and password
    Given User is navigated to saucedemo.com
    When User enters "standard_user" in the username field
    And User enters "secret_sauce" in the password field
    And User clicks on Login Button
    Then User is able to verify the "Products" label is displayed








