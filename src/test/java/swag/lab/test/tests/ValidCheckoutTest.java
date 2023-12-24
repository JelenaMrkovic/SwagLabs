package swag.lab.test.tests;

import org.testng.annotations.Test;
import swag.lab.test.BeforeAll;
import swag.lab.test.utility.fun.AccountFun;
import swag.lab.test.utility.fun.AddToCartFun;
import swag.lab.test.utility.fun.CheckoutFun;

public class ValidCheckoutTest extends BeforeAll {
    @Test
    public void validCheckout() throws InterruptedException {
        AccountFun.logInValidAccount(driver,wait);
        AddToCartFun.addBackpack(driver,wait);
        CheckoutFun.validCheckOut(driver,wait);
        AccountFun.logOutAccount(driver,wait);
    }
}
