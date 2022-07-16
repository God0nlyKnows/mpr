package pl.pjatk.test.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    @FindAll(@FindBy(className = "product-container"))
    private List<WebElement> products;

    @FindBy(className = "ajax_cart_quantity")
    private WebElement cartProductQuanity;

    @FindBy(className = "continue")
    private WebElement continueButton;

    @FindBy(id = "search_query_top")
    private WebElement searchBar;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    private WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("submit_search")));
        PageFactory.initElements(driver, this);
    }

    public SearchResultPage addFirstItemToCart() {

        WebElement product = products.get(0);

        product.findElement(By.className("ajax_add_to_cart_button")).click();
        return new SearchResultPage(driver);
    }

    public int getCartProductQuanity() {
        return Integer.parseInt(cartProductQuanity.getText());
    }

    public void closeSummaryDiv() {
        continueButton.click();
    }

}
