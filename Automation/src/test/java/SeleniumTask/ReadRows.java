package SeleniumTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadRows {
    WebDriver wd;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/sql/sql_where.asp");
    }

    @Test
    public void readRows(){
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[5]/table/tbody/tr/td[2]"));
        List<String> string = new ArrayList<>();
        for (WebElement wb:rows) {
            string.add(wb.getText());
        }
        System.out.println(string);
    }
    @Test
    public void readColumn(){
        List<WebElement> cols = wd.findElements(By.xpath("//*[@id=\"main\"]/div[5]/table/tbody/tr[2]/td"));
        List<String> string = new ArrayList<>();
        for (WebElement wb: cols){
            string.add(wb.getText());
        }
        System.out.println(string);
    }

}
