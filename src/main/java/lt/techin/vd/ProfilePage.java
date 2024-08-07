package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class ProfilePage extends BasePage{
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='wishlist-link']/span[@class='link-item']")
    private WebElement clickMyWishlist;

    public void clickMyWishList(){
        clickMyWishlist.click();
    }

}
