package samplePackage;

import hrm.or.ObjectRepo;
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

//        static WebDriver driver;
    public static ObjectRepo or = new ObjectRepo();

    public static void main(String[] args) {

        launchApplication();
        setValues(or.username, "admin");
        setValues(or.password, "admin123");
        click(or.btnLogin);
        waitUntilElementPresent(or.lblWelcome, 10);
        checkElementPresent(or.lblWelcome);

    }


}
