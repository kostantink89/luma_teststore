import base.BasePage;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.CustomerLoginPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

import static org.junit.Assert.assertEquals;

public class SignInUser extends BasePage {

    @Test
    public void loginTest() {

        HomePage home = new HomePage(driver);
        home.getSignIn();


        CustomerLoginPage loginPage = new CustomerLoginPage(driver)
                .setEmail("davidspencer@yahoo.com")
                .setPassword("spencerA22Q");
        loginPage.getSignInButton();

        MyAccountPage myPage = new MyAccountPage(driver);


        assertEquals("Welcome message at the top right is not displayed",
                myPage.getExpectedMessage("Welcome, David Spenser!"),
                myPage.getActualIconMessage());


    }


}
