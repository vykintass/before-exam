package lt.techin.vd;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".hidden-sm-down.logout")
    private WebElement getButtonInfo;
    @FindBy(css= ".hidden-sm-down.logout")
    private WebElement clickSignOutButton;
    @FindBy(css = "input[name='s']")
    private WebElement inputInSearch;
    @FindBy(css=".material-icons.search")
    private WebElement clickSearchIcon;
    @FindBy(css="div:nth-of-type(1) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement getItemDescription;
    @FindBy(css = "h4#product-search-no-matches")
    private WebElement getSearchErrorMessage;
    public String checkIfSignOutButtonIsDisplayed(){
        String targetText = "Sign Out";
        String fullText = getButtonInfo.getText();
        String cleanedText = fullText.replace(" ", "").trim();
       return cleanedText;
    }
    public boolean isSignOutButtonDisplayed(){
        return getButtonInfo.isDisplayed();
    }
    public void clickSignOutButton(){
        clickSignOutButton.click();
    }
    public void inputInSearch(String text){
        inputInSearch.sendKeys(text);
        inputInSearch.sendKeys(Keys.ENTER);
    }
    public void clickSearchIcon(){
        clickSearchIcon.click();
    }
    public String getItemDescription(){
        String fullText = getItemDescription.getText();
        String cleanedText = fullText.replace("Mug Today Is A Good ", "").trim();
        return cleanedText.toLowerCase();
    }
    public String getSearchErrorMessage(){
        return getSearchErrorMessage.getText();
    }

}
