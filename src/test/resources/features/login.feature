@AS
Feature: User app login page
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are:

  Scenario: As a user, I should be able to login Amazon account
    Given User on the login page
    When User click login page
    Then User should add username and password
    And User should click login button
    Then User should see amazon page
