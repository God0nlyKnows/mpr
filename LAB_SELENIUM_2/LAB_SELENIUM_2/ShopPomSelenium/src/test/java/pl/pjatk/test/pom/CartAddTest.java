package pl.pjatk.test.pom;

import org.junit.Assert;
import org.junit.Test;

public class CartAddTest extends BaseTest {

    @Test
    public void cartAdd() {
        NavigationBar navigationBar = new NavigationBar(driver);
        SearchResultPage sPage = navigationBar.searchProduct("blouse");

        sPage.addFirstItemToCart();
        int result = sPage.getCartProductQuanity();
        sPage.closeSummaryDiv();
        Assert.assertTrue(result > 0);
    }
}
