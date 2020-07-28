package SeleniumTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    WebDriver wd;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @Test
    public void Singlecheck(){
        wd.findElement(By.id("isAgeSelected")).click();
        String msg = "Success - Check box is checked";
        String text = wd.findElement(By.id("txtAge")).getText();


        //check the message displayed
        Assert.assertEquals(msg, text);
    }

    @Test
    public void MultipleCheck(){
        List<WebElement> checks = wd.findElements(By.id("check1"));
        for (WebElement ck:checks)
            ck.click();
    }

    @After
    public void close(){
        wd.quit();
    }

}
