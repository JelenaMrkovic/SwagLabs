package swag.lab.test.utility.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import swag.lab.test.page_object.PLPPageObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PLPSortFun {
    public static void lowToHigh (WebDriver driver, WebDriverWait wait) throws InterruptedException {

        List<WebElement> productPriceListUnsorted = driver.findElements(By.className("inventory_item_price"));
        List<String> productPriceListUnsortedString = new ArrayList<>();

        for (WebElement price : productPriceListUnsorted)
        {
            productPriceListUnsortedString.add(price.getText());
        }
        for (int i = 0; i<productPriceListUnsortedString.size();i++)
        {
            productPriceListUnsortedString.set(i,productPriceListUnsortedString.get(i).substring(1));
        }
        List<Double> productPriceListUnsortedDouble = new ArrayList<>();
        for (String price : productPriceListUnsortedString)
        {
            productPriceListUnsortedDouble.add(Double.parseDouble(price));
        }

        driver.findElement(PLPPageObject.productSortContainer).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[contains(text(),'Price (low to high)')]")).click();
        Thread.sleep(1000);

        List<WebElement> productPriceListSorted = driver.findElements(By.className("inventory_item_price"));
        List<String> productPriceListSortedString = new ArrayList<>();

        for (WebElement price : productPriceListSorted)
        {
            productPriceListSortedString.add(price.getText());
        }
        for (int i = 0; i<productPriceListSortedString.size();i++)
        {
            productPriceListSortedString.set(i,productPriceListSortedString.get(i).substring(1));
        }
        List<Double> productPriceListSortedDouble = new ArrayList<>();
        for (String price : productPriceListSortedString)
        {
            productPriceListSortedDouble.add(Double.parseDouble(price));
        }

        Collections.sort(productPriceListUnsortedDouble);

        Assert.assertEquals(productPriceListUnsortedDouble, productPriceListSortedDouble);

    }
    public static void zToA (WebDriver driver, WebDriverWait wait) throws InterruptedException {
        List<WebElement> unsortedName = driver.findElements(By.className("inventory_item_name"));
        List<String> unsortedNamesString = new ArrayList<>();
        for (WebElement name : unsortedName)
        {
            unsortedNamesString.add(name.getText());
        }

        Thread.sleep(1000);
        driver.findElement(PLPPageObject.productSortContainer).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[contains(text(),'Name (Z to A)')]")).click();
        Thread.sleep(1000);

        List<WebElement> unsortedNameSorted = driver.findElements(By.className("inventory_item_name"));
        List<String> unsortedNamesSortedString = new ArrayList<>();
        for (WebElement name : unsortedNameSorted)
        {
            unsortedNamesSortedString.add(name.getText());
        }

        Collections.sort(unsortedNamesString, Collections.reverseOrder());

        Assert.assertEquals(unsortedNamesString,unsortedNamesSortedString );
    }
}
