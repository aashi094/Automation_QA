package SeleniumTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
//automation.com footer
public class footerListVerify {
    WebDriver wd;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.manage().window().maximize();
    }

    @Test
    public void verifyFooterList(){
        List<String> footers = new ArrayList<>(Arrays.asList("My orders", "My credit slips","My addresses","My personal info"));
        List<WebElement> bullets = wd.findElements(By.cssSelector(".bullet>li"));
        List<String> list = new ArrayList<>();
        for(WebElement web:bullets){
            list.add(web.getText());
        }
        Assert.assertEquals(footers,list);
    }
}
