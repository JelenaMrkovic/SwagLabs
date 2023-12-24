package swag.lab.test.utility.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swag.lab.test.page_object.LogInPageObject;
import swag.lab.test.page_object.MenuPageObject;
import swag.lab.test.page_object.PLPPageObject;

public class AccountFun {
    public static void logInValidAccount(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        driver.findElement(LogInPageObject.userNameField).click();
        Thread.sleep(1000);
        driver.findElement(LogInPageObject.userNameField).sendKeys(LogInPageObject.validUser);
        driver.findElement(LogInPageObject.passwordField).click();
        driver.findElement(LogInPageObject.passwordField).sendKeys(LogInPageObject.userPassword);
        driver.findElement(LogInPageObject.logInButton).click();

        driver.findElement(PLPPageObject.productsText).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PLPPageObject.productsText));
    }

    public static void invalidLogInTest(WebDriver driver, WebDriverWait wait) throws InterruptedException {
        driver.findElement(LogInPageObject.userNameField).click();
        Thread.sleep(1000);
        driver.findElement(LogInPageObject.userNameField).sendKeys(LogInPageObject.invalidUser);
        Thread.sleep(1000);
        driver.findElement(LogInPageObject.passwordField).click();
        Thread.sleep(1000);
        driver.findElement(LogInPageObject.passwordField).sendKeys(LogInPageObject.invalidPassword);
        Thread.sleep(1000);
        driver.findElement(LogInPageObject.logInButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObject.errorMessage));

        String myText = driver.findElement(LogInPageObject.errorMessage).getText();
        Assert.assertEquals(myText, "Epic sadface: Username and password do not match any user in this service");
    }

    public static void logInWithEmptyUsernameField(WebDriver driver, WebDriverWait wait) throws InterruptedException {
        driver.findElement(LogInPageObject.passwordField).click();
        Thread.sleep(1000);
        driver.findElement(LogInPageObject.passwordField).sendKeys(LogInPageObject.userPassword);
        Thread.sleep(1000);
        driver.findElement(LogInPageObject.logInButton).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObject.errorMessage));

        String myText = driver.findElement(LogInPageObject.usernameRequiredMessage).getText();
        Assert.assertEquals(myText, "Epic sadface: Username is required");


    }

    public static void logOutAccount(WebDriver driver, WebDriverWait wait) {

        driver.findElement(MenuPageObject.burgerButton).click();
        driver.findElement(MenuPageObject.logOutButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObject.logInButton));
    }
}

