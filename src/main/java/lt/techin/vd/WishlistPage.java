package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".wishlist-list-item-title")
    private WebElement clickMyWishlist;
    @FindBy(css = ".wishlist-product-title")
    private WebElement getProductTitle;
    @FindBy(css=".wishlist-product-link .material-icons")
    private WebElement clickEditQuantity;
    @FindBy(css=".wishlist-button-add")
    private WebElement clickDeleteItem;
    @FindBy(css=".btn.wishlist-product-addtocart")
    private WebElement clickAddToCart;
    @FindBy(css=".cart-products-count")
    private WebElement getCartCount;
    @FindBy(css=".cart-content-btn [data-dismiss]")
    private WebElement clickContinueShopping;
    @FindBy(css=".wishlist-product-combinations-text > span:nth-of-type(3)")
    private WebElement getItemQuantity;
    @FindBy(css= ".wishlist-delete > div[role='dialog'] > div[role='document'] .btn.btn-primary")
    private WebElement clickRemoveButton;
    @FindBy(css= ".wishlist-toast-text")
    private WebElement getRemoveTextMessage;

    public void clickMyWishlist() {
        clickMyWishlist.click();
    }

    public String getProductTitle() {
        return getProductTitle.getText();
    }
    public void clickEditQuantity(){
        clickEditQuantity.click();
    }
    public void clickDeleteItem(){
        clickDeleteItem.click();
    }
    public void clickAddToCart(){
        clickAddToCart.click();
    }
    public Integer getCartItemsCount(){
        String fullText = getCartCount.getText(); // Assuming getCartCount is a WebElement
        Pattern pattern = Pattern.compile("\\((\\d+)\\)");
        Matcher matcher = pattern.matcher(fullText);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            throw new IllegalStateException("No match found for the cart items count");
        }   }
    public void clickContinueShopping(){
        clickContinueShopping.click();
    }
    public Integer getItemQuantity(){
        String fulltext = getItemQuantity.getText();
        String cleanedText = fulltext.replace("Quantity : ", "").trim();
        return Integer.parseInt(cleanedText);
    }
    public void clickRemoveButton(){
        clickRemoveButton.click();
    }
    public String getRemoveTextMessage(){
      return   getRemoveTextMessage.getText();
    }
}
