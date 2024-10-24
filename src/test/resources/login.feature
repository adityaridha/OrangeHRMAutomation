@login
Feature: Login

  @success-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user login using "admin" as username and "admin123" as password
    And user should be on dashboard page
    And user click "Leave" menu
