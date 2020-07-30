package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
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
        //simple alert
        WebElement alert = driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button"));
        alert.click();
        Thread.sleep(6000);
        Alert alert1 = driver.switchTo().alert();
        Assert.assertEquals(alert1.getText(),"A simple Alert");
        alert1.accept();
        Thread.sleep(5000);
    }
    @After
    public void close(){
        driver.close();
    }

}
