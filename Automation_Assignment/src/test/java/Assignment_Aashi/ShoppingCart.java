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

//3.Verify, the Shopping cart is empty initially , when clicked on empty
//shopping cart , it brings to you Shopping-cart summary page with
//message as “Your cart is empty”

public class ShoppingCart {
    WebDriver driver;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void checkCart() throws InterruptedException {
        WebElement check = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        check.click();
        Thread.sleep(1000);
        WebElement message = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
        Assert.assertEquals(message.getText(),"Your shopping cart is empty.");
        Thread.sleep(2000);
    }
    @After
    public void close(){
        driver.quit();
    }
}
