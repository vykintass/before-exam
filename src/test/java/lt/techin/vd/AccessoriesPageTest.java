package lt.techin.vd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.Collections;
import java.util.List;

public class AccessoriesPageTest extends BaseTest{

    @Test
    public void selectFilterByAvailabilityTest(){
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByAvailability();
        Assertions.assertEquals(11, accessoriesPage.getProductSize(), "Fail");
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByNewProduct();
        Assertions.assertEquals(11,  accessoriesPage.getProductSize(), "Fail");
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
        homePage.clickAccessoriesButton();
        accessoriesPage.setPriceRange(15,-20);
        Assertions.assertEquals(5,  accessoriesPage.getProductSize(), "Fail");
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByCategories();
        Thread.sleep(500);

        Assertions.assertEquals(8,  accessoriesPage.getProductSize(), "Fail");
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByColor();
        Thread.sleep(500);
        Assertions.assertEquals(3,  accessoriesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterByComposition() throws InterruptedException {
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByComposition();
        Thread.sleep(500);

        Assertions.assertEquals(4,  accessoriesPage.getProductSize(), "Fail");
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByProperty();
        Thread.sleep(500);

        Assertions.assertEquals(3,  accessoriesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterByBrand() throws InterruptedException {
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByBrand();
        Thread.sleep(500);

        Assertions.assertEquals(3,  accessoriesPage.getProductSize(), "Fail");
    }
    @Test
    public void selectFilterByPaperType() throws InterruptedException {
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByBrand();
        Thread.sleep(500);

        Assertions.assertEquals(3,  accessoriesPage.getProductSize(), "Fail");
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickFilterByBrand();
        accessoriesPage.clickClearAllFilters();
        Thread.sleep(500);
        Assertions.assertEquals(11,  accessoriesPage.getProductSize(), "Fail");
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickDropDownList();
        accessoriesPage.clickSalesHighestToLowest();
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickDropDownList();
        accessoriesPage.clickRelavance();
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickDropDownList();
        accessoriesPage.clickNameAtoZ();
        Thread.sleep(500);
        List<String> productNamesAtoZ = accessoriesPage.getProductNames();
        List<String> expectedProductNamesAtoZ = accessoriesPage.getProductNames();
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickDropDownList();
        accessoriesPage.clickNameZtoA();
        Thread.sleep(500);
        List<String> productNamesZtoA = accessoriesPage.getProductNames();
        List<String> expectedProductNamesZtoA = accessoriesPage.getProductNames();
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickDropDownList();
        accessoriesPage.clickPriceLowToHigh();
        Thread.sleep(500);
        List<Double> productPricesLowToHigh = accessoriesPage.productPrices();
        List<Double> expectedProductPricesLowToHigh = accessoriesPage.productPrices();
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickDropDownList();
        accessoriesPage.clickPriceHighToLow();
        Thread.sleep(500);
        List<Double> productPricesHighToLow = accessoriesPage.productPrices();
        List<Double> expectedProductPricesHighToLow = accessoriesPage.productPrices();
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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickDropDownList();
        accessoriesPage.clickReferenceAToZ();

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
        homePage.clickAccessoriesButton();
        accessoriesPage.clickDropDownList();
        accessoriesPage.clickReferenceZToA();

    }




}
