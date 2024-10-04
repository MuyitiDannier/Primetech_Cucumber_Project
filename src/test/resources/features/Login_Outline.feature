Feature: Login to Sauce Demo
  As a user,
  I want to be able to login to the Sauce Demo website

  Scenario: login with valid credentials
    Given user is navigated to the login page
    When user enters standard_user for username
    And enters secret_sauce for password
    And user clicks on login button
    Then user should be logged in successfully

  @Scenario_Outline
  # To make a scenario outline, we need to follow three rules:
  # 1: We need to use scenario outline instead of scenario
  # 2: We need to parameterize the fields that will have different values
  # 3: We need to use examples for the parameters
  Scenario Outline: User should not be able to login with invalid credentials
    Given user is navigated to the login page
    When user enters "<username>" and enters "<password>"
    Then user should not be able to login

  Examples:
    | username                | password     |
    | locked_out_user         | secret_sauce |
    | problem_user            | secret_sauce |
    | performance_glitch user | secret_sauce |
    | error_user              | secret_sauce |

