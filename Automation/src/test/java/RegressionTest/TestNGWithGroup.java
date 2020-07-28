package RegressionTest;

import org.testng.annotations.Test;

public class TestNGWithGroup {
    @Test
    public void t1(){
        System.out.println("Run normal test1");
    }
    @Test
    public void t2(){
        System.out.println("Run normal test2");
    }

    @Test(groups = {"Regression"})
    public void r1(){
        System.out.println("Running regression r1");
    }

    @Test(groups = {"Regression"})
    public void r2(){
        System.out.println("Running regression r2");
    }

    @Test(groups = {"Smoke"})
    public void s1(){
        System.out.println("Running smoke s1");
    }

    @Test(groups = {"Smoke"})
    public void s2(){
        System.out.println("Running smoke s2");
    }

    @Test(groups = {"Smoke","Regression"})
    public void s1r1(){
        System.out.println("Running smoke and regresion ");
    }
}
