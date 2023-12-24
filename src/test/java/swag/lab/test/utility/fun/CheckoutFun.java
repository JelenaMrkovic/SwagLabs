package swag.lab.test.utility.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swag.lab.test.page_object.CheckOutObject;

public class CheckoutFun {
    public static void validCheckOut (WebDriver driver, WebDriverWait wait) throws InterruptedException {

        driver.findElement(CheckOutObject.checkoutButton).click();
        Thread.sleep(1000);
        driver.findElement(CheckOutObject.firstNameField).click();
        Thread.sleep(1000);
        driver.findElement(CheckOutObject.firstNameField).sendKeys("Jelena");
        Thread.sleep(1000);
        driver.findElement(CheckOutObject.lastNameField).click();
        Thread.sleep(1000);
        driver.findElement(CheckOutObject.lastNameField).sendKeys("Mrkovic");
        driver.findElement(CheckOutObject.postalCode).click();
        Thread.sleep(1000);
        driver.findElement(CheckOutObject.postalCode).sendKeys("11000");
        Thread.sleep(1000);
        driver.findElement(CheckOutObject.continueButton).click();
        Thread.sleep(1000);
        driver.findElement(CheckOutObject.finishButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(CheckOutObject.thankYouMessage));

        String thankYou = driver.findElement(CheckOutObject.thankYouMessage).getText();
        Assert.assertEquals(thankYou, "Thank you for your order!");

    }
}
