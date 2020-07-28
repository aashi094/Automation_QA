package Automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SlideBar {
    WebDriver wd;
    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
    }
    @Test
    public void clickAndSlide() throws InterruptedException {
        double range = 53.00;
        //click the button
        wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        //scroll the page
        JavascriptExecutor js = (JavascriptExecutor) wd;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1500)");

        //slider actions
        WebElement slider = wd.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/div"));
        Actions move = new Actions(wd);
        Thread.sleep(1000);

        //1st method
        for (int i = 0; i<=range; i=i+25) {
            Action action = move.dragAndDropBy(slider,i,0).build();
            action.perform();
            Thread.sleep(1000);
        }

        /*
        //2nd method
        int width=slider.getSize().getWidth();
        for (int i = 20; i <range ; i++) {
            move.moveToElement(slider, ((width * i) / 100), 0).click();
            move.build().perform();
            System.out.println("Slider moved");
        }

        //3rd method
        move.dragAndDropBy(slider,150,150).build().perform();
        */

        Thread.sleep(1000);
        Assert.assertEquals("$53.00 - $53.00", wd.findElement(By.id("layered_price_range")).getText());
        //Assert.assertEquals("$53.00 - $53.00", wd.findElement(By.xpath("//*[@id=\"layered_price_range\"]")).getText());

    }
    @After
    public void close() {
        wd.quit();
    }
}
