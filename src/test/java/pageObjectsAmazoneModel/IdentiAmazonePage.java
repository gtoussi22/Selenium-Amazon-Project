package pageObjectsAmazoneModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdentiAmazonePage {
    @FindBy(id = "ap_email")
             private WebElement email;

    @FindBy(id = "continue")
             private WebElement continueButton;

    WebDriver driver;
    // constructeur
    public IdentiAmazonePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String getUrlWebPage() {

        return driver.getCurrentUrl();
    }

    public void getEmail() {
        email.click();
        email.sendKeys( "gtoussikamga@gmail.com");

    }
    public void getContinueButton() {
        continueButton.click();
    }

}
