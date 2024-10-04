package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {

    private static WebDriver driver;

    /**
     * This is a private constructor to force no object will be created.
     */
    private Driver(){

    }

    /**
     * This is the method to get the driver which will instantiate only once.
     * @return
     */
    public static WebDriver getDriver(){
        if(driver == null){
            driver = new ChromeDriver();
        }else if (((RemoteWebDriver) driver).getSessionId() == null) {
            driver = new ChromeDriver(); // Reinitialize if the session is closed
        }
        return driver;
    }

    /**
     * This is the method to check if the driver is still alive, then quit and set driver to null value.
     */
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}

