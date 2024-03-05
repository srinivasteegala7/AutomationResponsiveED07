@tag
Feature: Administrator - Verify that the Administrator user can add institutions to a particular user in the User Management.

  @sanity
  Scenario: Verify that the Administrator user can add institutions to a particular user in the User Management.
    Given the user is logged in
    When the User navigates to the UserMenu and specifies the User Name to search
    Then the User views the user details by clicking on the View Button
    And the User starts adding institutions to the user
