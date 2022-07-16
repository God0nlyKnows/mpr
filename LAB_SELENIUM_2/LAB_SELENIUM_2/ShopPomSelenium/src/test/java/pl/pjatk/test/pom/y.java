package pl.pjatk.test.pom;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class y extends BaseTest {
    @Test
    public void cartAdd() {
        var zaloguj = driver.findElement(By.cssSelector("a[data-testid='appLoginBtn']"));
        zaloguj.click();
    }
}
