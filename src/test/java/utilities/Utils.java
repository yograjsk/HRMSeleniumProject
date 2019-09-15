package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utils extends setupWebDriver{
    static WebDriver driver = setupWebDriver.driver;

    public Utils() throws IOException {
    }

//        static WebDriver driver = setupWebDriver.get;
    public static void launchApplication(){
        driver.get(Constants.APPLICATION_URL);
//        assertTrue
    }

    public static void setValues(By by, String value){
        driver.findElement(by).sendKeys(value);
    }

    public static void click(By by){
        driver.findElement(by).click();
        driver.findElement(By.id("test")).isDisplayed();
        driver.findElement(By.id("test")).getAttribute("id");
        List<WebElement> abc = driver.findElements(By.id("fda"));
        abc.size();


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

    public static boolean menuNavigation(By... menuItems){
        boolean flag = false;
        Actions action = new Actions(driver);
        int totalMenuItems = menuItems.length;
        int counter = 1;

        for(By by:menuItems){
            counter++;
            action.moveToElement(driver.findElement(by)).build().perform();
            if(counter==totalMenuItems){
                click(by);
                flag = true;
                break;
            }
        }
        return flag;
    }


}
