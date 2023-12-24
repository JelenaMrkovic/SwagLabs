package swag.lab.test.tests;

import org.testng.annotations.Test;
import swag.lab.test.BeforeAll;
import swag.lab.test.utility.fun.AccountFun;

public class LogInEmptyUsernameField extends BeforeAll {
    @Test(priority = 1, description = "User can not log in with empty username field")
    public void logInWithEmptyUsernameField () throws InterruptedException {
        AccountFun.logInWithEmptyUsernameField(driver,wait);
    }
}
