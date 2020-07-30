package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    WebDriver driver;
    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
    }
    @Test
    public void dragAndDrop() throws InterruptedException {
        Actions builder = new Actions(driver);
        WebElement bank = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
        builder.dragAndDropBy(bank,100,100).perform();
        Thread.sleep(6000);


    }

}
