@ACCOUNTS
Feature: Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts verify 5 row /page is default

  Background:
    When click on login button
    Then enter credintials
    Then click on sign in button
    Then click on account

  Scenario: verify five rows data
    Then verify five rows data

    Scenario: validate table records per page according to selected show per page.
      When change item number to "10"
      Then validate table records per page to 10

