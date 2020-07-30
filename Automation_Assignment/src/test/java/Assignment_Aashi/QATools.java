package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QATools {
    WebDriver driver;
    @Test
    public void openBrowser() throws InterruptedException {
        //String url = "https://www.toolsqa.com/automation-practice-form/";
        String baseUrl = "https://www.toolsqa.com";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of page is: " + driver.getTitle());
        Thread.sleep(2000);
        driver.quit();


    }

}
