package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openFacebook {
    WebDriver wd;
  @Before
  public void openBrowser(){
      WebDriverManager.chromedriver().setup();
      wd = new ChromeDriver();
      wd.get("https://www.facebook.com/");
  }
  @Test
  public void login(){
      wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("angelamaharjan@yahoo.com");
      wd.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("lovebhuntung@123");
      wd.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
  }
}
