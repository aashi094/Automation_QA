Feature: LoginFeature
  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I entered the users email address as Email:admin
    And I entered following details for login
    |username|password|
    | admin  | adminpassword |
    And I click login button
    Then I should see the userform page

  Scenario Outline: Login with correct username and password using scenario outline
    Given I navigate to the login page
    And I entered <username> and <password>

    And I click login button
    Then I should see the userform page

    Examples:
      |username|  password     |
      | execute  | automation |