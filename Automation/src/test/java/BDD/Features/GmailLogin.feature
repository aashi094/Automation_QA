Feature: Gmail Login Page
  Scenario: Validate gmail login page when user and password both are valid
    Given User is in gmail login page
    When User enters valid user in user field
    And Click next button
    And Enters valid password in password field
    And Click on next button to login
    Then Verify user is on email profile page