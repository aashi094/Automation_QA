package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
    @Test
    @Parameters({"id","name"})
    //once, we run the .xml file with <parameter>, it passes data here
    //and does the message printing.
    public void getIdName(int id, String name)
    {
        System.out.println("Getting values from .xml file " + id +" "+ name);
    }
}
