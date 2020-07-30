package StepDef;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseUtil {
    private BaseUtil base;
    public Hooks(BaseUtil base){
        this.base = base;

    }

    @Before
    public void initializeTest(){
        System.out.println("Opening the browser: Mock");
        base.StepInfo = "FireFoxDriver";
    }

    @After
    public void TearDownTest(){
        System.out.println("closing the browser");
    }
}
