package swag.lab.test.tests;

import org.testng.annotations.Test;
import swag.lab.test.BeforeAll;
import swag.lab.test.utility.fun.AccountFun;
import swag.lab.test.utility.fun.PLPSortFun;

public class LowToHighTest extends BeforeAll {
    @Test
    public void validLowToHighTest() throws InterruptedException {
        AccountFun.logInValidAccount(driver,wait);
        PLPSortFun.lowToHigh(driver,wait);

    }
}
