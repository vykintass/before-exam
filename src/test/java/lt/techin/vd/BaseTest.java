package lt.techin.vd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

        protected String firstName, lastName, email, password, birthdate;
        protected WebDriver driver;
        protected HomePage homePage;
        protected RegistrationPage registrationPage;
        protected LoginPage loginPage;
        protected AccountPage accountPage;
        protected ProfilePage profilePage;
        protected WebDriverWait wait;

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();

        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://192.168.88.254/");
        UserData.generateUserData();
        firstName = UserData.getFirstName();
        lastName = UserData.getLastName();
        email = UserData.getEmail();
        password = UserData.getPassword();
        birthdate = UserData.getBirthdate();


    }
    @AfterEach
    void tearDown(){
       // driver.quit();
    }
}
