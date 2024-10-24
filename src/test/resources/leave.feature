@leave
Feature: Leave

  @submit-leave
  Scenario Outline: Submit leave until leave balance empty
    Given user is on login page
    And user login using "admin" as username and "admin123" as password
    And user should be on dashboard page
    And user click "Leave" menu
    And user should be on Leave menu
    And user click "Apply" on Leave menu
    And user select leave type
    When user set from date to "<start-date>" and end date to "<end-date>"
    And user fill comment section with "<comment>"
    When user click Apply Leave button
    And user check the current leave balance
    And user click "My Leave" on Leave menu

    Examples:
      | start-date |  | end-date   | comment          |
      | 2024-11-01 |  | 2024-11-01 | Leave request #1 |
      | 2024-11-02 |  | 2024-11-02 | Leave request #2 |
      | 2024-11-03 |  | 2024-11-03 | Leave request #3 |
      | 2024-11-04 |  | 2024-11-04 | Leave request #4 |
      | 2024-11-05 |  | 2024-11-05 | Leave request #5 |
      | 2024-11-06 |  | 2024-11-06 | Leave request #6 |


