package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

    private WebDriver driver;
    private WebElement element = null;


    public MyAccountPage(WebDriver webBrowser) {
        this.driver = webBrowser;
    }

    private By myAccountTitle = By.xpath(".//span[@class='base']");
    private By welcomeMessageStore = By.xpath(".//div[contains(text(),'Thank you for registering with Fake Online Clothing Store.')]");
    private By welcomeAccountIcon = By.xpath(".//span[@class='logged-in']");

    public WebElement getMyAccountTitle() {
        element = driver.findElement(myAccountTitle);
        return element;
    }

    public WebElement getWelcomeMessageStore() {
        element = driver.findElement(welcomeMessageStore);
        return element;
    }

    public WebElement getWelcomeAccountIcon() {
        element = driver.findElement(welcomeAccountIcon);
        return element;
    }


    public String getExpectedMessage(String expectedMessage) {
         return expectedMessage;
    }

    public String getActualIconMessage() {
        return driver.findElement(welcomeAccountIcon).getText();
    }
}
