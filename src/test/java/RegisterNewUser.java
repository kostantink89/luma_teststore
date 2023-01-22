import base.BasePage;
import org.junit.Assert;
import org.junit.Test;
import pageObjects.CreateNewAccountPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

import static org.junit.Assert.assertEquals;

public class RegisterNewUser extends BasePage {


    @Test
    public void newUserRegistrationTest() throws InterruptedException {


        HomePage home = new HomePage(driver);
        home.getCreateAnAccount();

        CreateNewAccountPage newAccountPage = new CreateNewAccountPage(driver)
                .setFirstName("David")
                .setLastName("Spenser")
                .setEmail("davidspencer@yahoo.com")
                .setPassword("spencerA22Q")
                .setConfirmPassword("spencerA22Q");
        newAccountPage.getCreateAnAccountButton();

        MyAccountPage myAccount = new MyAccountPage(driver);
        assertEquals("Welcome message is not presented",
                myAccount.getExpectedMessage("Thank you for registering with Fake Online Clothing Store."),
                myAccount.getWelcomeMessageStore().getText());


    }


}

