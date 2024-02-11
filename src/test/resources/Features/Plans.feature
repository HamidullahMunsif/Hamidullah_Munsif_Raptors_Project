@PLANS
Feature: Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page.
  Validate 4 row of data is present.
Background:
  When click on login button
  When enter credintials
  Then click on sign in button
  Then click on plans button

@PLANS_2
  Scenario: navigate to plan page and validate 4 rows date

    Then validate first row data
    Then validate second row data
    Then validate third row data
    Then validate fourth row data

    Scenario:  validate Create Date is todays date in (EST Time zone) and Date Expire is a day after (EST Time Zone)
      Then validate Create Date
      Then validate Expiry Date
