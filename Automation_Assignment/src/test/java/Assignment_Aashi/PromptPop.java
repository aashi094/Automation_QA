package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPop {
    WebDriver driver;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().window().maximize();
    }

    @Test
    public void showAlert() throws InterruptedException {
        //prompt alert box
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)");
        WebElement promptBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/p[10]/button"));
        promptBtn.click();
        Thread.sleep(6000);
        Alert prompt_msg = driver.switchTo().alert();
        Assert.assertEquals(prompt_msg.getText(),"Do you like toolsqa?");
        prompt_msg.sendKeys("confirm");
        prompt_msg.accept();
        Thread.sleep(3000);
    }
    @After
    public void close(){
        driver.quit();
    }
}
