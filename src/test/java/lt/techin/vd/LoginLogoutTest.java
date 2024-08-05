package lt.techin.vd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginLogoutTest extends BaseTest{

    //TC001
    @Test
    public void loginWithValidCredentialsTest() {
        homePage.clickSignInButton();
        loginPage.inputEmail("admin@mail.com");
        loginPage.inputPassword("Slaptazodis123");
        loginPage.clickSigninButton();
    }
    //TC001a
    @Test
    public void loginWithInvalidEmailTest() {
        homePage.clickSignInButton();
        loginPage.inputEmail("admin@gmail.com");
        loginPage.inputPassword("Slaptazodis123");
        loginPage.clickSigninButton();
        Assertions.assertEquals("Authentication failed.",loginPage.getErrorMessageText(),"Fail");
    }
    //TC001b
    @Test
    public void loginWithEmptyEmailTest() {
        homePage.clickSignInButton();
        loginPage.inputEmail("");
        loginPage.inputPassword("Slaptazodis123");
        loginPage.clickSigninButton();
    }
    //TC001c
    @Test
    public void loginWithInvalidPasswordTest() {
        homePage.clickSignInButton();
        loginPage.inputEmail("admin@mail.com");
        loginPage.inputPassword("Slaptazodis");
        loginPage.clickSigninButton();
        Assertions.assertEquals("Authentication failed.",loginPage.getErrorMessageText(),"Fail");
    }
    //TC001d
    @Test
    public void loginWithInvalidPasswordAndEmailTest() {
        homePage.clickSignInButton();
        loginPage.inputEmail("admin@gmail.com");
        loginPage.inputPassword("Slaptazodis");
        loginPage.clickSigninButton();
        Assertions.assertEquals("Authentication failed.",loginPage.getErrorMessageText(),"Fail");
    }
    //TC002
    @Test
    public void logoutTest() {
        homePage.clickSignInButton();
        loginPage.inputEmail("admin@mail.com");
        loginPage.inputPassword("Slaptazodis123");
        loginPage.clickSigninButton();
        accountPage.clickSignOutButton();
        Assertions.assertEquals("Sign in",homePage.isSignInButtonDisplayed(),"Fail");
    }

}
