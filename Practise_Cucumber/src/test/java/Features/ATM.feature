Feature: ATM Card feature

  Scenario: Enter correct pin at ATM
    Given I insert the ATM card in ATM machine
    And I am asked to enter the pin
    And I entered the correct pin as "aashi"
    Then I should see the option to withdraw money
    Then I withdraw money