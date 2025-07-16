package amazoneExoPerso;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectsAmazoneModel.IdentiAmazonePage;
import pageObjectsAmazoneModel.IdentiAmazonePage1;
import pageObjectsAmazoneModel.LoginAmazonePage;
import pageObjectsAmazoneModel.SearchText;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class AmazoneExoPerso {
    static ChromeDriver driver;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();


    }
    @Test
    public void test001_logInUser() {
        LoginAmazonePage objLoginAmazonePage = new LoginAmazonePage(driver);
        objLoginAmazonePage.clickloginInUser();
        Assertions.assertTrue(driver.getTitle().contains("Amazon"));


    }
    @Test
    public void test002_IndentiInUser() {
        IdentiAmazonePage objIdentiAmazonePage = new IdentiAmazonePage(driver);
        objIdentiAmazonePage.getEmail();
        objIdentiAmazonePage.getContinueButton();
        Assertions.assertTrue(objIdentiAmazonePage.getUrlWebPage().contains("ap/signin"));
    }
    @Test
    public void test003_IndentiInUser1() {
        IdentiAmazonePage1 objIdentiAmazonePage1 = new IdentiAmazonePage1(driver);
        objIdentiAmazonePage1.passwordToUser();
        objIdentiAmazonePage1.continueButton();

    }
    @Test
    public void test004_searchTextbox() throws InterruptedException {
        SearchText objSearchText = new SearchText(driver);
        objSearchText.SearchTextToUser();
        objSearchText.SearchSubmitInput();
        //driver.navigate().refresh();
        //Thread.sleep(3000);
        //Assertions.assertTrue(objSearchText.getUrlWebPage().contains("/?ref_=nav_ya_signin"));
        Assertions.assertTrue(objSearchText.getUrlWebPage().contains("/s?") || objSearchText.getUrlWebPage().contains("k="));

    }
    @AfterAll
public static void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
}
