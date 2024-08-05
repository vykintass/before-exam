package lt.techin.vd;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

public class ArtPageTest extends BaseTest{

    @Test
    public void selectPriceRangeTest(){
        homePage.clickArtButton();
        artPage.setPriceRange(15, -10);

    }

}
