package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.ProductControl;
import utils.BaseTest;

@Listeners({Listener.class})
public class ProductControlTest extends BaseTest {

    @Test
    public void searchTest(){
        testCaseFunction.ProductControl productControl=new testCaseFunction.ProductControl(driver);
        productControl.runTest();
    }
}
