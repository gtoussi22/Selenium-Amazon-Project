package pageObjectsAmazoneModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAmazonePage {
    @FindBy(id = "nav-link-accountList")
    private WebElement loginLink;

    //@FindBy(css = "nav-action-inner")
    //private WebElement identificationButton;

    WebDriver driver;
    // constructeur
    public LoginAmazonePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickloginInUser(){
        loginLink.click();
    }
}
