package swag.lab.test.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import swag.lab.test.BeforeAll;
import swag.lab.test.utility.fun.AccountFun;
import swag.lab.test.utility.fun.PLPSortFun;

public class ValidPLPSortTest extends BeforeAll {
    @Test
    public void validSortTest () throws InterruptedException {
        AccountFun.logInValidAccount(driver,wait);
        PLPSortFun.lowToHigh(driver,wait);

    }
}
