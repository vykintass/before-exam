package lt.techin.vd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

public class RegistrationTest extends BaseTest{
    //TC001
    @Test
    public void clickSignInButtonTest(){
        homePage.clickSignInButton();
        Assertions.assertTrue(loginPage.isNoAccountTextDisplayed(),"Fail" );
    }
    //TC001a
    @Test
    public void clickNoAccountButtonTest(){
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        Assertions.assertEquals("Create an account",registrationPage.getRegistrationText(),"Fail" );
    }
    //TC002
    @Test
    public void selectSocialTitleTest(){
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.selectSocialTitle();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Sign out",accountPage.checkIfSignOutButtonIsDisplayed(),"Fail");

    }
}
