package swag.lab.test.page_object;

import org.openqa.selenium.By;

public class PLPPageObject {
    public static By productsText = By.xpath("//span[contains(text(),'Products')]");
    public static By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
    public static By shoppingCartBadge = By.xpath("//span[contains(text(),'1')]");
    public static By shoppingCart = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");
    public static By productSortContainer = By.className("product_sort_container");

}
