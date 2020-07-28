
package SeleniumTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoAlert {
    WebDriver driver;
    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().window().maximize();
    }
    @Test
    public void accept() throws Exception {
        //scroll the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,500)");
        //click the button
        WebElement web = driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button"));
        web.click();
        //create alert
        Thread.sleep(2000);
        Alert expected = driver.switchTo().alert();
        Assert.assertEquals(expected.getText(),"A simple Alert");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
    /*
    @Test
        public void dismiss() throws InterruptedException {
            JavascriptExecutor j = (JavascriptExecutor) driver;
            Thread.sleep(1000);
            j.executeScript("window.scrollBy(0,500)");
            //click the button
            WebElement webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button"));
            webElement.click();
            //create alert
            Alert confirmationAlert = driver.switchTo().alert();
            String alertText = confirmationAlert.getText();
            System.out.println("Alert text is " + alertText);

            confirmationAlert.dismiss();
        }
*/
}


