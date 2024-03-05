@tag
Feature: Administrator - Verify that the Administrator user can search for a particular teacher with a valid username in the Teacher Management.

  @sanity
  Scenario: Verify that the Administrator user can search for a particular teacher with a valid username in the Teacher Management.
    Given the user logs into the application
    And the User navigates to the Teacher Menu
    And the User sets the filters to show all options
    And the User finalizes the filter selection by clicking the GO button
    Then the User accesses the detailed view by selecting the View option
