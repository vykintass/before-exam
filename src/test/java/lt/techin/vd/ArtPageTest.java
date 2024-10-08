package lt.techin.vd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.List;

public class ArtPageTest extends BaseTest{
    @Test
    public void selectAvailabilityTest(){
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
        homePage.clickArtButton();
        artPage.clickFilterByInStock();
        Assertions.assertEquals(7,  artPage.getProductSize(), "Fail");
    }
    @Test
    public void selectNewProductTest(){
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
        homePage.clickArtButton();
        artPage.clickFilterByInStock();
        Assertions.assertEquals(7,  artPage.getProductSize(), "Fail");
    }


    @Test
    public void selectPriceRangeTest(){
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
        homePage.clickArtButton();
        artPage.setPriceRange(15, -10);
        Assertions.assertEquals(4,  artPage.getProductSize(), "Fail");
    }
    @Test
    public void selectCompositionTest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickFilterByComposition();
        Thread.sleep(500);
        Assertions.assertEquals(3,  artPage.getProductSize(), "Fail");
    }
    @Test
    public void selectBrandTest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickFilterByBrand();
        Thread.sleep(500);

        Assertions.assertEquals(6,  artPage.getProductSize(), "Fail");
    }
    @Test
    public void selectDimensionTest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickFilterByDimension();
        Thread.sleep(500);

        Assertions.assertEquals(3,  artPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterByAndPressClearAllTest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickFilterByDimension();
        artPage.clickClearAllFilters();
        Thread.sleep(500);
        Assertions.assertEquals(7,  artPage.getProductSize(), "Fail");
    }
    @Test
    public void selectSortBySalesTest(){
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
        homePage.clickArtButton();
        artPage.clickDropDownList();
        artPage.clickSalesHighestToLowest();
    }
    @Test
    public void selectSortByRelevanceTest(){
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
        homePage.clickArtButton();
        artPage.clickDropDownList();
        artPage.clickRelavance();
    }
    @Test
    public void selectSortByNameAtoZTest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickDropDownList();
        artPage.clickNameAtoZ();
        Thread.sleep(500);
        List<String> productNamesAtoZ = artPage.getProductNames();
        List<String> expectedProductNamesAtoZ = artPage.getProductNames();
        Collections.sort(expectedProductNamesAtoZ);
        Assertions.assertEquals( expectedProductNamesAtoZ,productNamesAtoZ,"Fail");
    }
    @Test
    public void selectSortByNameZtoATest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickDropDownList();
        artPage.clickNameZtoA();
        Thread.sleep(500);
        List<String> productNamesZtoA = artPage.getProductNames();
        List<String> expectedProductNamesZtoA = artPage.getProductNames();
        expectedProductNamesZtoA.sort(Collections.reverseOrder());
        Assertions.assertEquals( expectedProductNamesZtoA,productNamesZtoA,"Fail");
    }
    @Test
    public void selectSortByPriceLowToHighTest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickDropDownList();
        artPage.clickPriceLowToHigh();
        Thread.sleep(500);
        List<Double> productPricesLowToHigh = artPage.productPrices();
        List<Double> expectedProductPricesLowToHigh = artPage.productPrices();
        Collections.sort(expectedProductPricesLowToHigh);
        Assertions.assertEquals( expectedProductPricesLowToHigh,productPricesLowToHigh,"Fail");
    }
    @Test
    public void selectSortByPriceHighToLowTest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickDropDownList();
        artPage.clickPriceHighToLow();
        Thread.sleep(500);
        List<Double> productPricesHighToLow = artPage.productPrices();
        List<Double> expectedProductPricesHighToLow = artPage.productPrices();
        expectedProductPricesHighToLow.sort(Collections.reverseOrder());
        Assertions.assertEquals( expectedProductPricesHighToLow,productPricesHighToLow,"Fail");
    }
    @Test
    public void selectSortByReferenceAtoZTest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickDropDownList();
        artPage.clickReferenceAToZ();

    }
    @Test
    public void selectSortByReferenceZtoATest() throws InterruptedException {
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
        homePage.clickArtButton();
        artPage.clickDropDownList();
        artPage.clickReferenceZToA();

    }


}
