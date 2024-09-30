@Crater
Feature: User Access Management
  As a user, I want to login to my Crater application

  Rule: valid login
    The application should allow valid users to log in

  Background:
    Given user is navigated to Crater login page

  @smoke
  Scenario: User should be able to login with valid credentials
    When user enters valid username and valid password
    And user click on login button
    Then user should be logged in successfully

  @NegativeTest
  Scenario: User should not be able to login with invalid username and valid password
    When user enters invalid username and valid password
    And user click on login button
    Then user should see en error message "These credentials do not match our records." displayed
    And user should not be logged in