package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newsletter {
    WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void verifyCorrectEmail() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,2500)");
        driver.findElement(By.id("newsletter-input")).sendKeys("mahara2@unlv.nevada.edu");
        WebElement btn = driver.findElement(By.name("submitNewsletter"));
        btn.click();
        WebElement msg = driver.findElement(By.xpath("//*[@id=\"columns\"]/p"));
        Assert.assertEquals(msg.getText(),"Newsletter : This email address is already registered.");
        Thread.sleep(1000);
    }

    @Test
    public void verifyInCorrectEmail() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,2500)");
        driver.findElement(By.id("newsletter-input")).sendKeys("mahara2unlv.nevada.edu");
        WebElement btn = driver.findElement(By.name("submitNewsletter"));
        btn.click();
        Thread.sleep(3000);
        WebElement msg = driver.findElement(By.xpath("//*[@id=\"columns\"]/p"));
        Assert.assertEquals(msg.getText(),"Newsletter : Invalid email address.");
        Thread.sleep(1000);
    }

    @After
    public void close(){
        driver.quit();
    }
}
