package hrm.testcases;

import hrm.or.ObjectRepo;
import utilities.Utils;

import java.io.IOException;

public class LoginToHRM extends Utils {
    ObjectRepo or = new ObjectRepo();

    public LoginToHRM() throws IOException {
    }

    public void execute(){
//        String url = "http://127.0.0.1/orangehrm/symfony/web/index.php/auth/login";
//        driver.get(url);
        setValues(or.username, "admin");
        setValues(or.password, "admin123");
        click(or.btnLogin);
        waitUntilElementPresent(or.lblWelcome, 10);

//        menuNavigation()
    }
}
