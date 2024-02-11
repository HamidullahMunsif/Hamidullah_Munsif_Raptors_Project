@CREATE_ACCOUNT
Feature: validate form title
  Background: create account steps
    When click on primary account button


  Scenario: navigate to create account form
    Then validate form title Create Primary Account Holder

    Scenario: fill up the form
      Then fill up the form with user data
      Then click on create Account

      Scenario:   validate error message as expected
        Given validate error message as expected