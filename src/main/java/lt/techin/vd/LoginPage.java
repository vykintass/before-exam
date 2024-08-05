package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[data-link-action='display-register-form']")
    private WebElement getTextNoAccount;
    @FindBy(css = "input#field-email")
    private WebElement inputEmail;
    @FindBy(css= "input#field-password")
    private WebElement inputPassword;
    @FindBy(css = "button#submit-login")
    private WebElement pressSigninButton;
    @FindBy(css ="form#login-form a[rel='nofollow']")
    private WebElement clickForgotPassword;
    @FindBy(css = ".alert.alert-danger")
    private WebElement getErrorMessageText;
    public void inputEmail(String email){
        inputEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void clickSigninButton(){
        pressSigninButton.click();
    }
    public void clickForgotPassword(){
        clickForgotPassword.click();
    }
    public String getErrorMessageText(){
        return getErrorMessageText.getText();
    }

    public boolean isNoAccountTextDisplayed(){
       return getTextNoAccount.isDisplayed();
    }
    public void clickCreateOneHereButton(){
        getTextNoAccount.click();
    }
}
