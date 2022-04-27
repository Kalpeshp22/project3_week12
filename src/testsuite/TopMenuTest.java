package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputersPageSuccessfully() {
        //find the computers tab and click on the computer tab
        clickOnElement(By.partialLinkText("Computers"));
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //find the electronics  tab and click on the electronics tab
        clickOnElement(By.partialLinkText("Electronics"));
        String expectedMessage = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //find the apparel tab and click on the apparel  tab
        clickOnElement(By.partialLinkText("Apparel"));
        String expectedMessage = "Apparel";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //find the downloads tab and click on the downloads tab
        clickOnElement(By.partialLinkText("Digital downloads"));
        String expectedMessage = "Digital downloads";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //find the books tab and click on the books tab
        clickOnElement(By.partialLinkText("Books"));
        String expectedMessage = "Books";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //find the jewelery tab and click on the jewelry tab
        clickOnElement(By.partialLinkText("Jewelry"));
        String expectedMessage = "Jewelry";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //find the gift card tab and click on the gift card tab
        clickOnElement(By.partialLinkText("Gift Cards"));
        String expectedMessage = "Gift Cards";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='page-title']"));
    }

    @After
    // close the driver
    public void tearDown() {
        closeBrowser();
    }
}

