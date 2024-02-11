@LOGIN
Feature: Navigate to login by clicking on Login button and enter valid csr credintials
  Background: url and click on login button
    When click on login button

  Scenario: navigate to login by clicking login button and enter credintials

    When enter credintials
    Then click on sign in button

    Scenario: Navigate to login and enter wrong credentials and validate error message as expected
      Given enter wrong credintials
      Then click on sign in button
      Then wrong username error message validation

