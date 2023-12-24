package swag.lab.test.page_object;

import org.openqa.selenium.By;

public class LogInPageObject {

    public static By userNameField = By.id("user-name");
    public static By passwordField = By.id("password");
    public static By logInButton = By.id("login-button");
    public static String validUser = "standard_user";
    public static String userPassword = "secret_sauce";

    public static String invalidUser = "invalid user";
    public static String invalidPassword = "invalid password";
    public static By errorMessage = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]");

    public static By usernameRequiredMessage = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]");

}
