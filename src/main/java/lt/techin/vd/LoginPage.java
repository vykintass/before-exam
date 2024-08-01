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

    public boolean isNoAccountTextDisplayed(){
       return getTextNoAccount.isDisplayed();
    }
    public void clickCreateOneHereButton(){
        getTextNoAccount.click();
    }
}
