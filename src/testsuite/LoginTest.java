package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";
        //Find the welcome text Element and get the text
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
        //sending email to email field element
        sendTextToElement(By.id("Email"), "kalpeshpatel2022@gmail.com");
        //sending password to password field element
        sendTextToElement(By.name("Password"), "prime2022");
        //find log in link and click login link
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        // find the logout link and click logout link
        clickOnElement(By.linkText("Log out"));
    }

    @Test
    public void verifyTheErrorMessage() {
        // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
        //sending email to email field element
        sendTextToElement(By.id("Email"), "kalpeshpatel2220@gmail.com");
        //sending password to password field element
        sendTextToElement(By.name("Password"), "prime321");
        clickOnElement(By.linkText("Log in"));
        //This message from requirement
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
    }

    @After
    //close the driver
    public void tearDown() {
        closeBrowser();
    }
}
