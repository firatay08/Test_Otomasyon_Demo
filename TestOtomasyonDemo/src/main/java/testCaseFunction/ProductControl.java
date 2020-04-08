package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;

public class ProductControl extends BasePage {
    public ProductControl(WebDriver webDriver) {
        super(webDriver);
    }

    private By close=By.xpath("//a[@title='Close']");
    private By schneider=By.xpath("(((//div[@id='sticky']/div/div)[4]/div)[2]/a)[44]");
    private By sort=By.xpath("(((//div[@id='search-app']/div/div)[2]/div)[2]/div/div)[2]/select");
    private By product=By.xpath("//*[@id='search-app']/div/div[2]/div[2]/div[3]/div/div[2]/a");
    private By adBasket=By.xpath("//*[@id='product-detail-app']/div/div[2]/div[2]/div[2]/div[3]/button[1]");
    private By myBasket=By.xpath("//*[@id='myBasketListItem']/div/a");
    private By price=By.xpath("//*[@id='basketContent']/div[3]/div/div/ul/li/div[2]/div[4]/div[2]");
    private By totalPrice=By.xpath("//*[@id='basketAside']/div/div/dl/dd[4]");
    private By productName=By.xpath("//span[@title='Anahtar']");
    private By productName2=By.xpath("//*[@id='product-detail-app']/div/div[2]/div[2]/div[1]/div[1]/div[1]/h1/div/span");

    private String productNames;
    private String productNames2;


    public void runTest(){

        //webElement(close).click();
        //pause(500);
        //focus();
        pause(500);
        webElement(schneider).click();
        pause(500);
        selectElement(webElement(sort),"1");
        pause(500);
        productNames=webElement(productName).getText();
        webElement(product).click();
        pause(1000);
        productNames2=webElement(productName2).getText();
        String[] words = productNames2.split(" ");
        Assert.assertEquals(productNames,words[0]);
        webElement(adBasket).click();
        pause(1000);
        webElement(myBasket).click();
        Assert.assertEquals(productNames,webElement(productName).getText());
        Assert.assertEquals(webElement(price).getText(),webElement(totalPrice).getText());
    }
}
