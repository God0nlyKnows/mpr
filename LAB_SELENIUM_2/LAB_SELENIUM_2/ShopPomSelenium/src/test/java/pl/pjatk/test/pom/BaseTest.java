package pl.pjatk.test.pom;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void LoginToPage() {

        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://tinder.com/");

        NavigationBar navigationBar = new NavigationBar(driver);

    }

}
