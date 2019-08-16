package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class setupWebDriver {

    static WebDriver driver;

    public WebDriver getDriver() throws IOException {

        Properties prop = new Properties();
        System.out.println("current locaiton: " + System.getProperty("user.dir"));
        prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "/src/main/resources/propFiles/config.properties")));
        String browserName = prop.getProperty("browser","chrome");

        if(browserName.equalsIgnoreCase("chrome")){
            driver = getChromeDriver();
        }

        return driver;
    }

    public WebDriver getChromeDriver(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");

        driver = new ChromeDriver();
        return driver;
    }


}
