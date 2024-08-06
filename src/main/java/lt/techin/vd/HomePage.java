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
    @FindBy(css = "li:nth-of-type(3) > .dropdown-item")
    private WebElement clickArtButton;
    @FindBy(css="#category-6 > .dropdown-item")
    private WebElement clickAccessoriesButton;
    public String isSignInButtonDisplayed(){
        String targetText = "Sign Out";
        String fullText = clickSignInButton.getText();
        String cleanedText = fullText.replace(" ", "").trim();
        return cleanedText;
    }
    public void clickSignInButton(){
        clickSignInButton.click();
    }
    public void clickArtButton(){
        clickArtButton.click();
    }
    public void clickAccessoriesButton(){
        clickAccessoriesButton.click();
    }
}
