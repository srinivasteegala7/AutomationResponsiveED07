@tag
Feature: Administrator - Edit particular user details

  @sanity
  Scenario: User Management Edit particular user details
    Given User is on the login page
    Then User Clicks on the UserMenu
    Then User selects All Drop-down Values
    Then User Clicks the GO button
    Then User Enters User Name in the search user field
    Then User clicks on the edit button
    And User edits the user details
