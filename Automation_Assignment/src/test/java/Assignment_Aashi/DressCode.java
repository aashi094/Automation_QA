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

public class DressCode {
    WebDriver driver;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void search() throws InterruptedException {
        WebElement search = driver.findElement(By.id("search_query_top"));
        search.sendKeys("Saree");
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
        WebElement actual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
        Assert.assertEquals("No results were found for your search \"Saree\"",actual.getText());
        Thread.sleep(3000);
    }

    @After
    public void close(){
        driver.quit();
    }

}
