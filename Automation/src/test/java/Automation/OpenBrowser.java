package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class OpenBrowser {
    @Test
    public void openChromeBrowserWithoutDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
        sleep(5000);
        wd.quit();

    }

    @Test
    public void openBrowser() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
        sleep(5000);
        wd.quit();
    }
}
