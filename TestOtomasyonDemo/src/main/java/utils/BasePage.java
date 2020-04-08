package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public BasePage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public WebDriver webDriver;
    public WebElement webElement(By Locator){
        return webDriver.findElement(Locator);
    }

    public void selectElement(WebElement element, String value){
        Select select =new Select(element);
        select.selectByValue(value);
    }
    public void pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void focus(){
       // new Actions(webDriver).moveToElement(webElement(By.xpath("//a[text()='EV & YAŞAM']"))).click().perform();
       // new Actions(webDriver).moveToElement(webElement(By.xpath("//a[text()='EV & YAŞAM']"))).perform();
    }


}
