@Need
Feature: validation of facebook details

  Background: 
    Given User is on facebook page

  @Reg @Sanity
  Scenario: valid Login validation
    When User must enter credentials
    And User clicks login button
    Then User verify the success message

  @UAT
  Scenario: invalid Login validation
    When User must enter credentials
    And User clicks login button
    Then User verify the unsuccess message
