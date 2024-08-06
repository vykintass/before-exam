package lt.techin.vd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class ClothesPageTest extends BaseTest{

    @Test
    public void selectFilterByInStockTest(){
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
        homePage.clickClothesButton();
        clothesPage.clickFilterByAvailability();
        Assertions.assertEquals(2, clothesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterByNewProductTest(){
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
        homePage.clickClothesButton();
        clothesPage.clickFilterByNewProduct();
        Assertions.assertEquals(2,  clothesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterPriceTest(){
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
        homePage.clickClothesButton();
        clothesPage.setPriceRange(15,-20);
        Assertions.assertEquals(1,  clothesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterByCategoriesTest() throws InterruptedException {
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
        homePage.clickClothesButton();
        clothesPage.clickFilterByCategories();
        Thread.sleep(500);
        Assertions.assertEquals(1,  clothesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterBySizeTest() throws InterruptedException {
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
        homePage.clickClothesButton();
        clothesPage.clickFilterBySize();
        Thread.sleep(500);
        Assertions.assertEquals(2,  clothesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterByColorTest() throws InterruptedException {
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
        homePage.clickClothesButton();
        clothesPage.clickFilterByColor();
        Thread.sleep(500);
        Assertions.assertEquals(1,  clothesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterByProperty() throws InterruptedException {
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
        homePage.clickClothesButton();
        clothesPage.clickFilterByProperty();
        Thread.sleep(500);
        Assertions.assertEquals(1, accessoriesPage.getProductSize(), "Fail");
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
        homePage.clickClothesButton();
        clothesPage.clickFilterByCategories();
        clothesPage.clickClearAllFilters();
        Thread.sleep(500);
        Assertions.assertEquals(2,  clothesPage.getProductSize(), "Fail");
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
        homePage.clickClothesButton();
        clothesPage.clickDropDownList();
        clothesPage.clickSalesHighestToLowest();
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
        homePage.clickClothesButton();
        clothesPage.clickDropDownList();
        clothesPage.clickRelavance();
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
        homePage.clickClothesButton();
        clothesPage.clickDropDownList();
        clothesPage.clickNameAtoZ();
        Thread.sleep(500);
        List<String> productNamesAtoZ = clothesPage.getProductNames();
        List<String> expectedProductNamesAtoZ = clothesPage.getProductNames();
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
        homePage.clickClothesButton();
        clothesPage.clickDropDownList();
        clothesPage.clickNameZtoA();
        Thread.sleep(500);
        List<String> productNamesZtoA = clothesPage.getProductNames();
        List<String> expectedProductNamesZtoA = clothesPage.getProductNames();
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
        homePage.clickClothesButton();
        clothesPage.clickDropDownList();
        clothesPage .clickPriceLowToHigh();
        Thread.sleep(500);
        List<Double> productPricesLowToHigh = clothesPage.productPrices();
        List<Double> expectedProductPricesLowToHigh = clothesPage.productPrices();
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
        homePage.clickClothesButton();
        clothesPage.clickDropDownList();
        clothesPage.clickPriceHighToLow();
        Thread.sleep(500);
        List<Double> productPricesHighToLow = clothesPage.productPrices();
        List<Double> expectedProductPricesHighToLow = clothesPage.productPrices();
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
        homePage.clickClothesButton();
        clothesPage.clickDropDownList();
        clothesPage.clickReferenceAToZ();

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
        homePage.clickClothesButton();
        clothesPage.clickDropDownList();
        clothesPage.clickReferenceZToA();

    }
}
