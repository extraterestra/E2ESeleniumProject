package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        //chrome

        //firefox

        //IE

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("D:\\Docs\\Java\\E2ESeleniumProject\\src\\main\\java\\resources\\data.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);
        if (browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\dev\\selenium\\chromedriver_win32\\chromedriver.exe");
            //"C://dev//selenium//chromedriver_win32//chromedriver.exe"

            driver = new ChromeDriver();

        }
        else if (browserName.equals("chrome"))
        {

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
