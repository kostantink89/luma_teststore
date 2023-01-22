package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAccountPage {

    private WebDriver driver;

    public WebElement element = null;

    public CreateNewAccountPage(WebDriver webBrowser) {
        this.driver = webBrowser;

    }

    private By firstName = By.id("firstname");
    private By lastName = By.id("lastname");
    private By email = By.id("email_address");
    private By password = By.id("password");
    private By confirmPassword = By.id("password-confirmation");
    private By createAnAccountButton = By.xpath(".//button[@type='submit']/span[text()='Create an Account']");


    public CreateNewAccountPage setFirstName(String inputFirstName) {
        element = driver.findElement(firstName);
        element.clear();
        element.sendKeys(inputFirstName);
        return this;
    }

    public CreateNewAccountPage setLastName(String inputText) {
        element = driver.findElement(lastName);
        element.clear();
        element.sendKeys(inputText);
        return this;
    }

    public CreateNewAccountPage setEmail(String inputEmail) {
        element = driver.findElement(email);
        element.clear();
        element.sendKeys(inputEmail);
        return this;
    }

    public CreateNewAccountPage setPassword(String inputPassword) {
        element = driver.findElement(password);
        element.clear();
        element.sendKeys(inputPassword);
        return this;

    }

    public CreateNewAccountPage setConfirmPassword(String passwordConfirmationInput) {
        element = driver.findElement(confirmPassword);
        element.clear();
        element.sendKeys(passwordConfirmationInput);
        return this;
    }

    public WebElement getCreateAnAccountButton() {
        element = driver.findElement(createAnAccountButton);
        element.click();
        return element;
    }


}
