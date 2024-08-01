package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".hidden-sm-down.logout")
    private WebElement getButtonInfo;
    public String checkIfSignOutButtonIsDisplayed(){
        String targetText = "Sign Out";
        String fullText = getButtonInfo.getText();
        String cleanedText = fullText.replace(" ", "").trim();
       return cleanedText;
    }

}
