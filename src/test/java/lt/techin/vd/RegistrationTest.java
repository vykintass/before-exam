package lt.techin.vd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

public class RegistrationTest extends BaseTest {
    //TC001
    @Test
    public void clickSignInButtonTest() {
        homePage.clickSignInButton();
        Assertions.assertTrue(loginPage.isNoAccountTextDisplayed(), "Fail");
    }

    //TC001a
    @Test
    public void clickNoAccountButtonTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        Assertions.assertEquals("Create an account", registrationPage.getRegistrationText(), "Fail");
    }

    //TC002
    @Test
    public void registrationWithAllValidCredentialsTest() {
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
        Assertions.assertEquals("Sign out", accountPage.checkIfSignOutButtonIsDisplayed(), "Fail");

    }

    //TC003
    @Test
    public void emptySocialTitleTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Sign out", accountPage.checkIfSignOutButtonIsDisplayed(), "Fail");
    }

    //TC004
    @Test
    public void firstNameTooLongTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX");
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("The first name field is too long (255 chars max).", registrationPage.getFirstNameErrorMessage(), "Fail");
    }

    //TC004a
    @Test
    public void firstNameTooShortTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName("");
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
    }

    //TC004b
    @Test
    public void firstNameInvalidFormatTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName("123a#");
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Invalid format.", registrationPage.getFirstNameErrorMessage(), "Fail");
    }

    //TC005
    @Test
    public void lastNameTooLongTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX");
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("The last name field is too long (255 chars max).", registrationPage.getLastNameErrorMessage(), "Fail");
    }

    //TC005a
    @Test
    public void lastNameTooShortTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName("");
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
    }

    //TC005b
    @Test
    public void lastNameInvalidFormatTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName("123a#");
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Invalid format.", registrationPage.getLastNameErrorMessage(), "Fail");
    }

    //TC006
    @Test
    public void emailWithoutEtaTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail("emailaddressgmail.com");
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
    }

    //TC006a
    @Test
    public void emailWithoutDotTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail("emailaddress@gmailcom");
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Invalid format.", registrationPage.getEmailErrorMessage(), "Fail");
    }

    //TC006b
    @Test
    public void emailWithoutDomainTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail("emailaddress@a");
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Invalid format.", registrationPage.getEmailErrorMessage(), "Fail");
    }

    //TC006c
    @Test
    public void usedEmailBeforeTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail("admin@mail.com");
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("The email is already used, please choose another one or sign in", registrationPage.getEmailErrorMessage(), "Fail");
    }

    //TC006d
    @Test
    public void emptyEmailTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail("");
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
    }

    //TC007
    @Test
    public void passwordTooShortTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword("2A#a8S9");
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Password must be between 8 and 72 characters long", registrationPage.getPasswordErrorMessage(), "Fail");
    }

    //TC007a
    @Test
    public void passwordTooLongTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword("A8s9Qw3eR1tY6uI4oP2aS7dF5gH8jK9lZ0xC3vB7nM5pL2qW1eR4tY6uI7oP3sD5fG8hJ9kL0zX4cV3bN7mP5");
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Password must be between 8 and 72 characters long", registrationPage.getPasswordErrorMessage(), "Fail");

    }

    //TC007b
    @Test
    public void passwordIsNotSafeEnoughTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword("2A#aaaaa");
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("The minimum score must be: Strong", registrationPage.getPasswordErrorMessage(), "Fail");
    }

    //TC008
    @Test
    public void birthdateWithoutSlashTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate("05311980");
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Format should be 05/31/1970.", registrationPage.getBirthdateErrorMessage(), "Fail");

    }

    //TC008a
    @Test
    public void birthdateWithReverseOrderTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate("1980/05/31");
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Format should be 05/31/1970.", registrationPage.getBirthdateErrorMessage(), "Fail");
    }

    //TC008b
    @Test
    public void birthdateWithWithEmptyFieldTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate("");
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
        Assertions.assertEquals("Sign out", accountPage.checkIfSignOutButtonIsDisplayed(), "Fail");
    }

    //TC009
    @Test
    public void registrationWithOnlyCheckedAgreeToTheTermsOfServiceTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickAgreeToTheTermsOfService();
        registrationPage.clickSaveButton();
      //  Assertions.assertEquals("Sign out", accountPage.checkIfSignOutButtonIsDisplayed(), "Fail");
    }

    //TC009
    @Test
    public void registrationWithOnlyCheckedCustomerDataServiceTest() {
        homePage.clickSignInButton();
        loginPage.clickCreateOneHereButton();
        registrationPage.inputFirstName(firstName);
        registrationPage.inputLastName(lastName);
        registrationPage.inputEmail(email);
        registrationPage.inputPassword(password);
        registrationPage.inputBirthdate(birthdate);
        registrationPage.clickCustomerDataPrivacyCheckbox();
        registrationPage.clickSaveButton();
       // Assertions.assertEquals("Sign out", accountPage.checkIfSignOutButtonIsDisplayed(), "Fail");
    }

}
