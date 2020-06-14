package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//div[@class='control-input']//input[@class='form-control input-hg']")
    WebElement email;

    @FindBy(xpath = ".//div[@class='control-input']//input[@type='password']")
    WebElement password;

    @FindBy(xpath = ".//div[@class='form-group text-center']//input[@type='submit']")
    WebElement login;

    public WebElement getEmail()
    {
        return email;
    }

    public WebElement getPassword()
    {
        return password;
    }

    public WebElement getLogin()
    {
        return login;
    }
}

