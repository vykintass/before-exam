package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".wishlist-list-item-title")
    private WebElement clickMyWishlist;
    @FindBy(css = ".wishlist-product-title")
    private WebElement getProductTitle;

    public void clickMyWishlist() {
        clickMyWishlist.click();
    }

    public String getProductTitle() {
        return getProductTitle.getText();
    }
}
