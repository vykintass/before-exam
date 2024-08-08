package lt.techin.vd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListTest extends BaseTest{


    @Test
    public void addItemToTheWishlistTest() throws InterruptedException {
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
    @Test
    public void addItemToTheWishlistAddToCartTest() throws InterruptedException {
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

        Integer initialCount = homePage.getCartItemsCount();
        homePage.clickHeartButtonOnItem();
        homePage.clickChooseWishlist();
        homePage.clickProfile();
        profilePage.clickMyWishList();
        wishlistPage.clickMyWishlist();
        wishlistPage.clickAddToCart();
        wishlistPage.clickContinueShopping();
        Integer afterwardsCount = wishlistPage.getCartItemsCount();
        Assertions.assertTrue(afterwardsCount==initialCount+1, "Fail");

    }
    @Test
    public void addItemToTheWishlistEditQuantityTest() throws InterruptedException {
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
        homePage.clickHeartButtonOnItem();
        homePage.clickChooseWishlist();
        homePage.clickProfile();
        profilePage.clickMyWishList();
        wishlistPage.clickMyWishlist();
        Integer initialQnt = wishlistPage.getItemQuantity();
        wishlistPage.clickEditQuantity();
        itemPage.clickHeart();
        itemPage.clickIncreaseQuantity();
        itemPage.clickHeart();
        itemPage.clickAddItemToTheWishlist();
        homePage.clickProfile();
        profilePage.clickMyWishList();
        wishlistPage.clickMyWishlist();
        Integer updatedQnt = wishlistPage.getItemQuantity();
        Assertions.assertTrue(updatedQnt>initialQnt, "Fail");
    }
    @Test
    public void addItemToTheWishlistDeleteItemTest() throws InterruptedException {
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
        homePage.clickHeartButtonOnItem();
        homePage.clickChooseWishlist();
        homePage.clickProfile();
        profilePage.clickMyWishList();
        wishlistPage.clickMyWishlist();
        wishlistPage.clickDeleteItem();
        wishlistPage.clickRemoveButton();
        Thread.sleep(200);
        Assertions.assertEquals("Product successfully removed",wishlistPage.getRemoveTextMessage(), "Fail");
    }
}
