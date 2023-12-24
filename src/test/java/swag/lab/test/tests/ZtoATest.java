package swag.lab.test.tests;

import org.testng.annotations.Test;
import swag.lab.test.BeforeAll;
import swag.lab.test.utility.fun.AccountFun;
import swag.lab.test.utility.fun.PLPSortFun;

public class ZtoATest extends BeforeAll {
    @Test
    public void validZtoATest () throws InterruptedException {
        AccountFun.logInValidAccount(driver,wait);
        PLPSortFun.zToA(driver,wait);
    }
}
