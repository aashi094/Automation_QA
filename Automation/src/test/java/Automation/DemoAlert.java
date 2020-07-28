package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoAlert {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
    }

    @Test
    public void showAlert() throws InterruptedException {
        WebElement cusID = driver.findElement(By.name("cusid"));
        cusID.sendKeys("53920");
        WebElement btn = driver.findElement(By.name("submit"));
        btn.click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"Do you really want to delete this Customer?");
        alert.accept();
        //alert.dismiss();

        Thread.sleep(4000);
    }
    @After
    public void close(){
        driver.quit();
    }

}
