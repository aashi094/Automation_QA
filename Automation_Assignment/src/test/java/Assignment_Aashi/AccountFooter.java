package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountFooter {
    WebDriver driver;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void verifyFooter() throws InterruptedException {
        List<String> footers = new ArrayList<>(Arrays.asList("My orders", "My credit slips","My addresses","My personal info"));
        List<WebElement> elements = driver.findElements(By.cssSelector(".bullet>li"));
        List<String> list = new ArrayList<>();
        for(WebElement web:elements){
            list.add(web.getText());
        }
        Assert.assertEquals(footers,list);
        Thread.sleep(3000);
    }

    @After
    public void close(){
        driver.quit();
    }
}
