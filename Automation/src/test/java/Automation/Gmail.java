package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
    @Test
    public void openGmail() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        //WebDriverManager.firefoxdriver().setup();
        //WebDriver wd = new FirefoxDriver();
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();


        WebElement email = wd.findElement(By.id("identifierId"));
        email.sendKeys("testautomatic29@gmail.com");

        WebElement next = wd.findElement(By.xpath("//*[@id=\"identifierNext\"]"));
        next.click();

        WebElement  pass = wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        pass.sendKeys("testautomatic@123");

        //invalidpassword
        //pass.sendKeys("testme");

        WebElement nextbtn = wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
        nextbtn.click();



    }
}
