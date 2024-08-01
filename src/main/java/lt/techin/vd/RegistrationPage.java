package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "h1")
    private WebElement getRegistrationText;
    @FindBy(css  = "label:nth-of-type(1)  input[name='id_gender']")
    private WebElement selectSocialTitle;
    @FindBy(id= "field-firstname")
    private WebElement inputFirstName;
    @FindBy(id= "field-lastname")
    private WebElement inputLastName;
    @FindBy(id= "field-email")
    private WebElement inputEmail;
    @FindBy(id= "field-password")
    private WebElement inputPassword;
    @FindBy(css= "#field-birthday")
    private WebElement inputBirthdate;
    @FindBy(css = "input[name='psgdpr']")
    private WebElement clickAgreeToTheTermsOfServiceCheckbox;
    @FindBy(css= "input[name='customer_privacy']")
    private WebElement clickCustomerDataPrivacyCheckbox;
    @FindBy(css = ".btn.btn-primary.float-xs-right.form-control-submit")
    private  WebElement clickSaveButton;
    public  String getRegistrationText(){
       return getRegistrationText.getText();
    }
    public void selectSocialTitle(){
        selectSocialTitle.click();
    }
    public void inputFirstName(String firstName){
        inputFirstName.sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        inputLastName.sendKeys(lastName);
    }
    public void inputEmail(String email){
        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void inputBirthdate(String birthdate){
        inputBirthdate.sendKeys(birthdate);
    }
    public void clickAgreeToTheTermsOfService(){
        clickAgreeToTheTermsOfServiceCheckbox.click();
    }
    public void clickCustomerDataPrivacyCheckbox(){
        clickCustomerDataPrivacyCheckbox.click();
    }
    public void clickSaveButton(){
        clickSaveButton.click();
    }


}
