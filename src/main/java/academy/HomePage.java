package academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class HomePage extends Base {

    @Test(dataProvider = "getData")
    public  void basePageNavigation(String email, String password) throws IOException {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");

        LandingPage l = new LandingPage(driver);
        l.getLogin().click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmail().sendKeys("sergiy.kucheryavyy@gmail.com");
        loginPage.getPassword().sendKeys("Svetlica7");
        loginPage.getLogin().click();
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object [1][2];

        //comment
        return data;
    }

}
