package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLoginPage {

    private WebDriver driver;
    private WebElement element = null;

    public CustomerLoginPage(WebDriver webBrowser) {
        this.driver = webBrowser;
    }

    private By customerLoginTitle = By.xpath(".//span[@class='base']");
    private By email = By.id("email");
    private By password = By.id("pass");
    private By signIn = By.xpath(".//button[@type='submit']/span[contains(text(),'Sign In')]");

    public CustomerLoginPage setEmail(String inputEmailAddress) {
        element = driver.findElement(email);
        element.clear();
        element.sendKeys(inputEmailAddress);
        return this;
    }

    public CustomerLoginPage setPassword(String inputPassword) {
        element = driver.findElement(password);
        element.clear();
        element.sendKeys(inputPassword);
        return this;
    }

    public WebElement getSignInButton() {
        element = driver.findElement(signIn);
        element.click();
        return element;
    }
}
