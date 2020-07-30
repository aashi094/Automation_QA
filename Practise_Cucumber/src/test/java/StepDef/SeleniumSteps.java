package StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSteps {
    WebDriver wd;
    @Given("^I am on the home page of softpost$")
    public void i_am_on_the_home_page_of_softpost() throws Throwable {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://softpost.org/");
    }

    @And("^I should navigate the page$")
    public void iShouldNavigateThePage() {
    }

    @Then("^I should see the title contains tutorials$")
    public void iShouldSeeTheTitleContainsTutorials() throws Throwable {
        assert wd.getTitle().toLowerCase().contains("tutorials");
        wd.close();
        wd.quit();
    }


}
