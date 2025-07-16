package pageObjectsAmazoneModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdentiAmazonePage1 {
    @FindBy(id = "ap_password")
    private WebElement Password;

    @FindBy(id = "signInSubmit")
    private WebElement continueButton1;
    WebDriver driver;
    // constructeur
    public IdentiAmazonePage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void passwordToUser() {
        Password.click();
        Password.sendKeys( "K@ki2244");
    }
    public void continueButton() {
        continueButton1.click();
    }

}
