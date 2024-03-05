@tag
Feature: Administrator - Verify that the Administrator user can add roles to a particular user in the User Management.

  @sanity
  Scenario: Verify that the Administrator user can add roles to a particular user in the User Management.
    Given the user navigates to the login page
    When the User selects the UserMenu
    Then the User initiates the search process by clicking the GO button
    And the User specifies the User Name to search
    And the User navigates to view the user details by clicking on the View Button
    Then the User adds roles to the user
