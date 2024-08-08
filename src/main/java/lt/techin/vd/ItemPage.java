package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage{
    public ItemPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".bootstrap-touchspin-up.btn.btn-touchspin.js-touchspin > .material-icons.touchspin-up")
    private WebElement clickIncreaseQuantity;
    @FindBy(css=".wishlist-button-add.wishlist-button-product")
    private WebElement clickHeart;
    @FindBy(css=".wishlist-list > .wishlist-list-item")
    private WebElement clickAddItemToTheWishlist;
    public void clickIncreaseQuantity(){
        clickIncreaseQuantity.click();
    }
    public void clickHeart(){
        clickHeart.click();
    }
    public void clickAddItemToTheWishlist(){
        clickAddItemToTheWishlist.click();
    }
}
