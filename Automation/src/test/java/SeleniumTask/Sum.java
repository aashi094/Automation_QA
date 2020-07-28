package SeleniumTask;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Sum {
    WebDriver wd;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/sql/sql_where.asp");
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.manage().window().maximize();
    }
    @Test
    public void testSum(){
        double actualSum = 0.00;
        double expectedSum = 90.35;
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row: rows) {
            System.out.println(row.getText());
            double number = Double.parseDouble(row.getText());
            actualSum = actualSum + number;
            
        }
        Assert.assertEquals(actualSum, expectedSum, 0.001);
        
        
     }



}
