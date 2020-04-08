package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {

    public void onTestStart(ITestResult result) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver( options );
        driver.get(baseUrl);
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("başarılı sonuçlandı");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("hatalı sonuçlandı");
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
    }

    public void onStart(ITestContext context) {
        driver=new ChromeDriver();
    }

    public void onFinish(ITestContext context) {
       // driver.quit();
    }
}
