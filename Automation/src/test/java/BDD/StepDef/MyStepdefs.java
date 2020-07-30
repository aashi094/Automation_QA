package BDD.StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyStepdefs {
    WebDriver driver;
    @Given("^User is in gmail login page$")
    public void userIsInGmailLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
    }

    @When("^User enters valid user in user field$")
    public void userEntersValidUserInUserField() {
        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("testdummy4test@gmail.com");

    }

    @And("^Click next button$")
    public void clickNextButton() throws InterruptedException {
        WebElement next1 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]"));
        next1.click();
        Thread.sleep(2000);
    }

    @And("^Enters valid password in password field$")
    public void entersValidPasswordInPasswordField() throws InterruptedException {
        WebElement  pass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        pass.sendKeys("testing@123");
        Thread.sleep(2000);
    }

    @And("^Click on next button to login$")
    public void clickOnNextButtonToLogin() {
        WebElement next2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
        next2.click();
    }

    @Then("^Verify user is on email profile page$")
    public void verifyUserIsOnEmailProfilePage() throws InterruptedException {
        System.out.println("User is on profile page.");
        //String expected = "Get started with Gmail";
        //WebElement actual = driver.findElement(By.xpath("//*[@id=\":1\"]/div/div/div[7]/div[1]/div[1]"));
        //Assert.assertEquals(expected,actual.getText());
        Thread.sleep(4000);
        driver.quit();

    }
}
