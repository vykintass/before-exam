package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ArtPage extends BasePage{

    public ArtPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement clickFilterByInStock;

    @FindBy(css="section:nth-of-type(2) > .collapse .custom-checkbox")
    private WebElement clickFilterNewProduct;
    @FindBy(css="section:nth-of-type(4) > .collapse .custom-checkbox")
    private WebElement clickFilterByComposition;
    @FindBy(css="clickFilterByComposition")
    private WebElement clickFilterByBrand;
    @FindBy(css= "section:nth-of-type(6) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private  WebElement clickFilterByDimension;
    @FindBy(css=".ui-corner-all.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content > a:nth-of-type(1)")
    private WebElement leftSlider;
    @FindBy(css=".ui-corner-all.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content > a:nth-of-type(2)")
    private WebElement rightSlider;

    public void clickFilterByInStock(){
        clickFilterByInStock.click();
    }
    public void clickFilterByNewProduct(){
        clickFilterNewProduct.click();
    }
    public void clickFilterByComposition(){
        clickFilterByComposition.click();
    }
    public void clickFilterByBrand(){
        clickFilterByBrand.click();
    }
    public void clickFilterByDimension(){
        clickFilterByDimension.click();
    }
    public void setLeftSlider(int xOffset) {
        Actions move = new Actions(driver);
        move.dragAndDropBy(leftSlider, xOffset, 0).perform();
    }

    public void setRightSlider(int xOffset) {
        Actions move = new Actions(driver);
        move.dragAndDropBy(rightSlider, xOffset, 0).perform();
    }

    public void setPriceRange(int leftOffset, int rightOffset) {
        setLeftSlider(leftOffset);
        setRightSlider(rightOffset);
    }
}
