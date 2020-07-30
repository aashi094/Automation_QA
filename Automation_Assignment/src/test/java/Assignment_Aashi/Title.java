package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//1. Write an Automation Script to verify the Title of the www.automationpractice.com

public class Title {
    WebDriver driver;
    @Test
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        String expectedTitle = driver.getTitle();
        String actualTitle = "My Store";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @After
    public void close(){
        driver.quit();
    }
}
