package lt.techin.vd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListTest extends BaseTest{


    @Test
    public void addItemToTheWishlist() throws InterruptedException {
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
        String expectedTitle = homePage.getItemTitle();
        homePage.clickHeartButtonOnItem();
        homePage.clickChooseWishlist();
        homePage.clickProfile();
        profilePage.clickMyWishList();
        wishlistPage.clickMyWishlist();
        Assertions.assertEquals(expectedTitle.toLowerCase(),wishlistPage.getProductTitle().toLowerCase(), "Fail");
        
    }
}
