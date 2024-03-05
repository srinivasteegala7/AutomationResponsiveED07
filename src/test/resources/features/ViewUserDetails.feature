@tag
Feature: Administrator - View Particular User Details

  @sanity
  Scenario: View Particular User Details
    Given the user is on the login page
    When the User navigates to the UserMenu
    And the User clicks the GO button
    Then the User enters the User Name to search
    Then the User clicks on the View Button
