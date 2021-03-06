import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import java.io.IOException;

public class HomePageSecondTest extends Base {
    public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeClass()
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized");
        driver.get(prop.getProperty("url"));
        log.info("Url opened");
    }

    @Test()
    public  void basePageNavigation2() throws IOException {

        LandingPage l = new LandingPage(driver);
        l.getLogin().click();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmail().sendKeys("sergiy.kucheryavyy@gmail.com");
        loginPage.getPassword().sendKeys("Svetlica7");
        loginPage.getLogin().click();
        //Some assertion here
        Assert.assertEquals(1,2);
        Assert.assertTrue(false );
        System.out.println("result");
        log.error("Assertion is NOT successful");
        log.info("Assertion is successful");
    }

//    @DataProvider
//    public Object[][] getData(){
//        Object[][] data = new Object [1][2];
//        return data;
//    }

    @AfterClass()
    public void teardown() throws IOException {
        driver.close();
    }

}
