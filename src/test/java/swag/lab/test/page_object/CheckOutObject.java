package swag.lab.test.page_object;

import org.openqa.selenium.By;

public class CheckOutObject {
    public static By checkoutButton = By.id("checkout");
    public static By firstNameField = By.id("first-name");
    public static By lastNameField = By.id("last-name");
    public static By postalCode = By.id("postal-code");
    public static By continueButton = By.id("continue");
    public static By finishButton = By.id("finish");
    public static By thankYouMessage = By.xpath("//h2[contains(text(),'Thank you for your order!')]");
    public static By sauceLabsBackpack = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]");



}
