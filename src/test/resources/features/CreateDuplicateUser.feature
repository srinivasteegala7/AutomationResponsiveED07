@tag
Feature: Administrator - Check the flow of Duplicate user

  @sanity
  Scenario: Verify the flow of Duplicate user
    Given the user is logged in with valid credentials
    When the User accesses the UserMenu
    Then Click on The GO Button
    When the User searches for a specific user by name
    Then Click on Duplicate Account button
    Then Enter Duplicate user details
    Then click on Create button
