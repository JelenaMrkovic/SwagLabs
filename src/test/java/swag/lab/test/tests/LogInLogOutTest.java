package swag.lab.test.tests;

import org.testng.annotations.Test;
import swag.lab.test.BeforeAll;
import swag.lab.test.utility.fun.AccountFun;

public class LogInLogOutTest extends BeforeAll {

    @Test(priority = 1, description = "Standard - Valid User Log In")
    public void logInTest() throws InterruptedException {
        AccountFun.logInValidAccount(driver, wait);
        AccountFun.logOutAccount(driver, wait);
    }
}
