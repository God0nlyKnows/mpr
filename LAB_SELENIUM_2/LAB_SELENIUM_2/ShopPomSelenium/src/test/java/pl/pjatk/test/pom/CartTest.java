package pl.pjatk.test.pom;

import org.junit.Assert;
import org.junit.Test;

public class CartTest extends BaseTest {
    @Test
    public void cartStatusEmpty(){
        NavigationBar navigationBar = new NavigationBar(driver);

        Assert.assertTrue(navigationBar.getCartStatus().contains("empty"));
    }
}
