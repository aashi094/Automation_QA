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

public class ImageHandling {
    WebDriver driver;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void verifyImage() throws InterruptedException {
        WebElement dress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
        dress.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,2500)");
        WebElement list = driver.findElement(By.xpath("//*[@id=\"list\"]/a/i"));
        list.click();
        //System.out.println("hello");
        WebElement large = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div/div[1]/div/a[1]/img"));
        large.click();
        Thread.sleep(5000);
        WebElement images = driver.findElement(By.xpath("//*[@id=\"bigpic\"]"));
        images.click();
       //Thread.sleep(5000);
        //WebElement next = driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/div[1]/a[2]"));
        //next.click();
        WebElement img = driver.findElement(By.id("category"));
        img.click();

        //System.out.println("hello");
        Thread.sleep(4000);
    }
/*
    @After
    public void close(){
        driver.close();
    }

 */
}
