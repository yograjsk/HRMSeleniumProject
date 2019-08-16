package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import utilities.Utils;
import utilities.setupWebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Sample extends Utils{

//        static Utils utils = new Utils();
        static WebDriver driver;


    public static void main(String[] args) {

        String url = "http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login";

        driver.get(url);
        setValues(By.id("txtUsername"), "admin");
        setValues(By.id("txtPassword"), "admin123");
        click(By.id("btnLogin"));
        waitUntilElementPresent(By.id("welcome"), 10);
        checkElementPresent(By.id("welcome"));

    }


}
