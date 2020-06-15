package resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Base {

    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {
        //chrome

        //firefox

        //IE

        prop = new Properties();
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

    public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
        FileUtils.copyFile(source, new File(destinationFile));

    }

}
