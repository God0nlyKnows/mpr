package pl.pjatk.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar {
    @FindBy(className = "login")
    private WebElement loginButton;

    @FindBy(className = "logout")
    private WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    private WebElement cartButton;

    @FindBy(id = "search_query_top")
    private WebElement searchBar;

    @FindBy(name = "submit_search")
    private WebElement searchButton;

    @FindBy(className = "account")
    private WebElement userButton;

    private WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage openLoginPage() {
        loginButton.click();
        return new LoginPage(driver);
    }

    public LoginPage logout() {
        logoutButton.click();
        return new LoginPage(driver);
    }

    public String getCartStatus() {
        return cartButton.getText();
    }

    public SearchResultPage searchProduct(String query) {
        searchBar.sendKeys(query);
        searchButton.click();
        return new SearchResultPage(driver);
    }

    public String getUserName() {
        return userButton.getText();
    }
}
