package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TestScreenshot {
    WebDriver driver;
    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
    }

    @Test
    public void takeScreenshot() throws IOException, InterruptedException {
        String fileName1 = "InvalidEmail";
        String fileName2 = "InvalidPassword";
        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("testautomatic29@gmail");

        //Thread.sleep(3000);
        WebElement next1 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]"));
        next1.click();
        File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file1, new File("/Users/angelamaharjan/IdeaProjects/Automation_Assignment/"
                + "/src/test/java/Assignment_Aashi/" + fileName1 + ".jpg"));


        Thread.sleep(2000);

        File file2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file2, new File("/Users/angelamaharjan/IdeaProjects/Automation_Assignment/"
                + "/src/test/java/Assignment_Aashi/" + fileName2 + ".jpg"));

        WebElement  pass = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        pass.sendKeys("testautomatic@123");


        WebElement next2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));

        Thread.sleep(2000);
    }

    public void close(){
        driver.quit();
    }
}
