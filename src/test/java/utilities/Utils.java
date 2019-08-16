package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

public class Utils extends setupWebDriver{
    public static void setValues(By by, String value){
        driver.findElement(by).sendKeys(value);
    }

    public static void click(By by){
        driver.findElement(by).click();
    }

    public static boolean selectFromDropdown(By by, String value){
        boolean flag = false;
        try{
            Select dropdown = new Select(driver.findElement(by));
            dropdown.selectByVisibleText(value);
            flag = true;
        }catch (Exception e){

        }
        return flag;
    }

    public static boolean checkElementPresent(By by){
        boolean present = false;
        try{
            turnOffImpliciteWait();
            present = driver.findElement(by).isDisplayed();
        }catch (Exception e){
            turnOnImpliciteWait();
        }
        return present;
    }

    public static void turnOnImpliciteWait() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void turnOffImpliciteWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    public static boolean waitUntilElementPresent(By by, int waitTime){
        boolean present = false;
        try{
            present = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
            System.out.println("element present: " + present);
        }catch (Exception e) {

        }
        return present;
    }


}