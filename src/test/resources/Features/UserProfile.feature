@USER_PROFILE
Feature:log in and validate information in profile
  Background:
    When click on login button
    When enter credintials
    Then click on sign in button
    Then click on profile button

  Scenario:Navigate to login and enter valid CSR credentials and validate the information
    Then validate profile information

    Scenario: click on profile button and then click on Logout button make sure user navigate to home page
      When click on Logout Button
      Then validate Home page title