package lt.techin.vd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class AccessoriesPage extends BasePage{

    public AccessoriesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement clickFilterByAvailability;
    @FindBy(css="section:nth-of-type(2) > .collapse .custom-checkbox")
    private WebElement clickFilterNewProduct;
    @FindBy(css=".ui-corner-all.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content > a:nth-of-type(1)")
    private WebElement leftSlider;
    @FindBy(css=".ui-corner-all.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content > a:nth-of-type(2)")
    private WebElement rightSlider;
    @FindBy(css="section:nth-of-type(4) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement clickFilterByCategories;
    @FindBy(css="section:nth-of-type(5) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement clickFilterByColor;
    @FindBy(css="section:nth-of-type(6) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement clickFilterByComposition;
    @FindBy(css="section:nth-of-type(7) > .collapse > li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement clickFilterByProperty;
    @FindBy(css="section:nth-of-type(8) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement clickFilterByBrand;
    @FindBy(css= "section:nth-of-type(9) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private  WebElement clickFilterByPaperType;

    @FindBy(css = ".products.row > div")
    private List<WebElement> allProducts;
    @FindBy(css= ".js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private List<WebElement> productsNames;
    @FindBy(css=" .js-product-miniature.product-miniature.reviews-loaded .price")
    private List<WebElement> productPrices;
    @FindBy(css="div#_desktop_search_filters_clear_all > .btn.btn-tertiary.js-search-filters-clear-all")
    private WebElement clickClearAllFilters;

    @FindBy(css =".dropdown-menu > a:nth-of-type(1)")
    private WebElement clickSalesHighestToLowest;
    @FindBy(css =".dropdown-menu > a:nth-of-type(2)")
    private WebElement clickRelavance;
    @FindBy(css= ".dropdown-menu > a:nth-of-type(3)")
    private WebElement clickNameAtoZ;
    @FindBy(css= ".dropdown-menu > a:nth-of-type(4)")
    private WebElement clickNameZtoA;
    @FindBy(css= ".dropdown-menu > a:nth-of-type(5)")
    private WebElement clickPriceLowToHigh;
    @FindBy(css= ".dropdown-menu > a:nth-of-type(6)")
    private WebElement clickPriceHighToLow;
    @FindBy(css= ".dropdown-menu > a:nth-of-type(7)")
    private WebElement clickReferenceAToZ;
    @FindBy(css= ".dropdown-menu > a:nth-of-type(8)")
    private WebElement clickReferenceZToA;
    @FindBy(css=".btn-unstyle.select-title")
    private WebElement clickDropDownList;



    public void clickFilterByAvailability(){
        clickFilterByAvailability.click();
    }
    public void clickFilterByNewProduct(){
        clickFilterNewProduct.click();
    }
    public void clickFilterByCategories(){
        clickFilterByCategories.click();
    }
    public void clickFilterByColor(){
        clickFilterByColor.click();
    }
    public void clickFilterByComposition(){
        clickFilterByComposition.click();
    }
    public void clickFilterByProperty(){
        clickFilterByProperty.click();
    }
    public void clickFilterByBrand(){
        clickFilterByBrand.click();
    }
    public void clickFilterByPaperType(){
        clickFilterByPaperType.click();
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
    public List<WebElement> getAllProducts(){
        return allProducts;
    }
    public int getProductSize(){
        return allProducts.size();
    }
    public void clickClearAllFilters(){
        clickClearAllFilters.click();
    }

    public void clickSalesHighestToLowest(){
        clickSalesHighestToLowest.click();
    }
    public  void clickRelavance(){
        clickRelavance.click();
    }
    public void clickNameAtoZ(){
        clickNameAtoZ.click();
    }
    public void clickNameZtoA(){
        clickNameZtoA.click();
    }
    public void clickPriceLowToHigh(){
        clickPriceLowToHigh.click();
    }
    public void clickPriceHighToLow(){
        clickPriceHighToLow.click();
    }
    public void clickReferenceAToZ(){
        clickReferenceAToZ.click();
    }
    public void  clickReferenceZToA(){
        clickReferenceZToA.click();
    }
    public void clickDropDownList(){
        clickDropDownList.click();
    }
    public List<String> getProductNames() {
        return productsNames.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    public List<Double> productPrices(){
        return   productPrices.stream()
                .map(WebElement::getText)
                .map(priceText -> Double.parseDouble(priceText.replaceAll("[^\\d.]", "")))
                .collect(Collectors.toList());
    }
}
