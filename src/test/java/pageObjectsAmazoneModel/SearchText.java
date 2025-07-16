package pageObjectsAmazoneModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchText {
    WebDriver driver;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "nav-search-submit-text")
    private WebElement searchButton;

    // constructeur
    public SearchText(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String getUrlWebPage() {

        return driver.getCurrentUrl();
    }

    public void SearchTextToUser() {
        searchBox.click();
        searchBox.sendKeys("Chaussures de mariage pour hommes");
    }
    public void SearchSubmitInput() {
        searchButton.click();
    }

}



