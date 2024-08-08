package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    @FindBy(css="#_desktop_top_menu .category:nth-of-type(1) [data-depth='0']")
    private WebElement clickClothesButton;
    @FindBy(css="[title] .hidden-sm-down")
    private WebElement clickProfile;
    @FindBy(css=".products.row [class='js-product product col-xs-12 col-sm-6 col-lg-4 col-xl-3']:nth-of-type(1) .wishlist-button-add")
    private WebElement clickHeartButtonOnItem;
    @FindBy(css=".products.row > div:nth-of-type(1) > .js-product-miniature.product-miniature.reviews-loaded h3 > a")
    private WebElement getItemTitle;
    @FindBy(css=".wishlist-list > .wishlist-list-item")
    private WebElement clickChooseWishlist;
    @FindBy(css=".cart-products-count")
    private WebElement getCartCount;
    public void clickProfile(){
        clickProfile.click();
    }
    public void clickHeartButtonOnItem(){
        clickHeartButtonOnItem.click();
    }
    public String getItemTitle(){
        Scroller.scrollToElement(driver, getItemTitle);
        return getItemTitle.getText();
    }
    public String isSignInButtonDisplayed(){
        String targetText = "Sign Out";
        String fullText = clickSignInButton.getText();
        String cleanedText = fullText.replace(" ", "").trim();
        return cleanedText;
    }
    public void clickChooseWishlist(){
        clickChooseWishlist.click();
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
    public void clickClothesButton(){
        clickClothesButton.click();
    }
    public Integer getCartItemsCount(){
        String fullText = getCartCount.getText(); // Assuming getCartCount is a WebElement
        Pattern pattern = Pattern.compile("\\((\\d+)\\)");
        Matcher matcher = pattern.matcher(fullText);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            throw new IllegalStateException("No match found for the cart items count");
        }
    }
}

