package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = ".//div[@class='container-fluid']//*[contains(text(),'Login')]")
    private WebElement login;

    public WebElement getLogin()
    {
        return login;
    }


}
