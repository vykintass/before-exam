package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".user-info .hidden-sm-down")
    private WebElement clickSignInButton;

    public void clickSignInButton(){
        clickSignInButton.click();
    }
}
