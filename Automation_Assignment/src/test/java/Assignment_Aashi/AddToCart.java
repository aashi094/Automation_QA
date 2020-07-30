package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//8. Verify Add to Cart Works
//Select the 3rd listed product from index page and add to cart. Verify after
//adding to the card, The status of the cart on top right corner changes from
//empty to 1.

public class AddToCart {
    WebDriver driver;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void addCart() throws InterruptedException {
        WebElement add = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img"));
        Actions action = new Actions(driver);
        action.moveToElement(add).build().perform();
        WebElement btn = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]"));
        btn.click();
        Thread.sleep(2000);
        WebElement proceedBtn = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
        proceedBtn.click();
        Thread.sleep(2000);
    }
    @After
    public void close(){
        driver.close();
    }
}
