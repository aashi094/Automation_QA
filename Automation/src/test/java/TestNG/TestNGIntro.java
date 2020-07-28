package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGIntro {
    //@BeforeTest once execute
    @BeforeMethod
    // executes every time when new test case comes

    public void beforetest(){
        System.out.println("hello");
    }
    @Test
    public void test1(){
        System.out.println("everyone");
    }
    @Test
    public void test2(){
        System.out.println("good");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Bye");
    }
}
