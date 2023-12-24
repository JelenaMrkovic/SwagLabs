package swag.lab.test.utility.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swag.lab.test.page_object.CheckOutObject;
import swag.lab.test.page_object.PLPPageObject;

public class AddToCartFun {
    public static void addBackpack (WebDriver driver, WebDriverWait wait) throws InterruptedException {

        driver.findElement(PLPPageObject.addBackpack).click();
        Thread.sleep(1000);
        driver.findElement(PLPPageObject.shoppingCartBadge).isDisplayed();
        Thread.sleep(1000);
        driver.findElement(PLPPageObject.shoppingCart).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html");

        wait.until(ExpectedConditions.visibilityOfElementLocated(CheckOutObject.sauceLabsBackpack));
        Thread.sleep(1000);
        String productName = driver.findElement(CheckOutObject.sauceLabsBackpack).getText();
        Assert.assertEquals(productName,"Sauce Labs Backpack");


    }
}
