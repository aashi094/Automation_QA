package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmPop {
    WebDriver driver;
    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().window().maximize();
    }
    @Test
    public void confirmAlert() throws InterruptedException {
        //confirm pop up
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button"));
        button.click();
        Thread.sleep(6000);
        Alert alert_msg = driver.switchTo().alert();
        Assert.assertEquals(alert_msg.getText(), "Confirm pop up with OK and Cancel button");
        alert_msg.dismiss();
        Thread.sleep(3000);
    }
    public void close(){
        driver.quit();
    }
}

