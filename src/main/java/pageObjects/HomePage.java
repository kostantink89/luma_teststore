package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    private WebElement element = null;

    public HomePage(WebDriver webBrowser) {
        this.driver = webBrowser;
    }

    private By welcomeMessage = By.xpath(".//span[@class='not-logged-in'][normalize-space()='Default welcome msg!']");
    private By signIn = By.xpath(".//li[@class='authorization-link']/a[normalize-space()='Sign In']");
    private By CreateAnAccount = By.xpath(".//li/a[contains(text(),'Create an Account')]");
    private By searchInputBar = By.xpath(".//input[@id='search']");
    private By whatsNew = By.xpath(".//a[@role='menuitem']/span[@xpath=1]");
    private By womenClothes = By.xpath(".//a/span[contains(text(),'Women')]");
    private By menClothes = By.xpath(".//a/span[contains(text(),'Men')]");

    private By GearItems = By.xpath(".//span[normalize-space()='Gear']");


    public WebElement getCreateAnAccount() {
        element = driver.findElement(CreateAnAccount);
        element.click();
        return element;
    }

    public WebElement getWelcomeMessage() {
        element = driver.findElement(welcomeMessage);
        return element;
    }

    public WebElement getSignIn() {
        element = driver.findElement(signIn);
        element.click();
        return element;
    }


    public WebElement getWomenClothes() {
        element = driver.findElement(womenClothes);
        element.click();
        return element;
    }

    public WebElement getMenClothes() {
        element = driver.findElement(menClothes);
        element.click();
        return element;
    }

    public WebElement getSearchInputBar(String inputText) {
        element = driver.findElement(searchInputBar);
        element.clear();
        element.sendKeys(inputText);
        return element;
    }


}
