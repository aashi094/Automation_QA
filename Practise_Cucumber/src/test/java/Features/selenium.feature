Feature: Run Selenium Scenarios

  Scenario: Check the title of softpost.org
    Given I am on the home page of softpost
    And I should navigate the page
    Then I should see the title contains tutorials