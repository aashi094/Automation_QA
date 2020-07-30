package Assignment_Aashi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GetExcel {
    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    @Before
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void testingWithExcel() throws IOException, InterruptedException {
        File src = new File("/Users/angelamaharjan/IdeaProjects/Automation_Assignment/excel/Source.xlsx");

        // Load the file.
        FileInputStream finput = new FileInputStream(src);
        workbook = new XSSFWorkbook(finput);
        sheet = workbook.getSheet("Sheet1");
        //Import data for username
        cell = sheet.getRow(1).getCell(1);
        driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());

        //Import data for password.
        cell = sheet.getRow(2).getCell(1);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(cell.getStringCellValue());

        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
        }

    public void close(){
        driver.close();
    }

}

