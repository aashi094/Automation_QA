package StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef_ATM {
    @Given("^I insert the ATM card in ATM machine$")
    public void i_insert_the_ATM_card_in_ATM_machine() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I am asked to enter the pin$")
    public void iAmAskedToEnterThePin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I entered the correct pin$")
    public void iEnteredTheCorrectPin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should see the option to withdraw money$")
    public void iShouldSeeTheOptionToWithdrawMoney() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I withdraw money$")
    public void iWithdrawMoney() throws Throwable {

    }

    @And("^I entered the correct pin as \"([^\"]*)\"$")
    public void iEnteredTheCorrectPinAs(String pin) throws Throwable {
        System.out.println("The pin is :" + pin);
    }
}
