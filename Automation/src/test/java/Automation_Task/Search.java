package Automation_Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Search {
    WebDriver driver;
    @Before
    public void openGmail() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void search() throws InterruptedException {

        WebElement input = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        input.sendKeys("panda");
        input.submit();
        Thread.sleep(5000);
        List<WebElement> allLinks = driver.findElements(By.cssSelector(".LC20lb.DKV0Md"));
        List<String> list = new ArrayList<>();
        for (WebElement wb : allLinks){
            //System.out.println(wb.getText());
            if(wb.getText().contains("|")){
                list.add(wb.getText());
            }
            System.out.println(list);
        }

    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


}
