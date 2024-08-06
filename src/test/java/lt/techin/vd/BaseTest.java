package lt.techin.vd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

        protected String firstName, lastName, email, password, birthdate;
        protected WebDriver driver;

        protected HomePage homePage;
        protected RegistrationPage registrationPage;
        protected LoginPage loginPage;
        protected AccountPage accountPage;
        protected ArtPage artPage;
        protected AccessoriesPage accessoriesPage;
        protected ClothesPage clothesPage;
        protected ProfilePage profilePage;
        protected WebDriverWait wait;

    @BeforeEach
    void setup(){
       // driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        artPage = new ArtPage(driver);
        accessoriesPage = new AccessoriesPage(driver);
        clothesPage = new ClothesPage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://192.168.1.175/");
        UserData.generateUserData();
        firstName = UserData.getFirstName();
        lastName = UserData.getLastName();
        email = UserData.getEmail();
        password = UserData.getPassword();
        birthdate = UserData.getBirthdate();


    }
    @AfterEach
    void tearDown(){
       driver.quit();
    }
}
