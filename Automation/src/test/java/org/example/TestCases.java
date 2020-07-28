package org.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCases {
    @Test
    public void add(){
        int a = 1, b = 1;
        int results = 2;
        assertEquals(results,a+b);
    }
    @Test
    public void compareValue(){
        float a = 2, b = 1;
        assertTrue(a > b);

    }
    @Test
    public void showEqual(){
        String str1 = "hi";
        String str2 = "hi";
        assertSame(str1,str2);
    }
    @Test
    public void checkName(){
        System.out.println("Name=@13");
        assertFalse(true);
    }
    @Test
    public void checkNull(){
        int a = 2;
        assertNull(a);
    }

}
