package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.LoginPage;
import Pages.SettingsPage;
import Utilities.Driver;
import Utilities.SeleniumUtils;

import java.time.Duration;

public class UserAccess_StepDef {
    WebDriver driver = Driver.getDriver();//declaring the driver as global because it will be used across all the class
    LoginPage loginPage = new LoginPage();
    SettingsPage settingsPage = new SettingsPage();

    //First Scenario
    @Given("user is navigated to Crater login page")
    public void user_is_navigated_to_crater_login_page() {
        driver.get("http://crater.primetech-apps.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() throws InterruptedException {
        SeleniumUtils.sendkeysWithActionsClass(loginPage.emailInput, "entityadmin@primetechschool.com");
        Thread.sleep(1000);
        SeleniumUtils.sendkeysWithActionsClass(loginPage.passwordInput, "primetech@school");
        Thread.sleep(1000);
    }
    @And("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(1000);
    }
    @Then("user should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        //verify using the url that is different from login
        String loginUrl = "http://crater.primetech-apps.com/login";
        String afterLoginUrl = driver.getCurrentUrl();
        System.out.println("Current URL after login in is : " + afterLoginUrl);
        Assert.assertNotEquals(loginUrl , afterLoginUrl);
        //verify using the setting label is displayed
        Assert.assertTrue(settingsPage.settingsLabel.isDisplayed());
    }

    // Second Scenario
    @When("user enters invalid username and valid password")
    public void user_enters_invalid_username_and_valid_password() throws InterruptedException {
        //entering invalid username and valid password
        SeleniumUtils.sendkeysWithActionsClass(loginPage.emailInput, "invalid@primetechschool.com");
        Thread.sleep(1000);
        SeleniumUtils.sendkeysWithActionsClass(loginPage.passwordInput, "primetech@school");
        Thread.sleep(1000);
    }

    @And("user click on login button")
    public void user_click_on_login_button() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(1000);
    }

    @Then("user should see en error message {string} displayed")
    public void user_should_see_en_error_message_displayed(String expectedErrorMessage) {
        //verify that the error message is displayed is equal to the expected error message
        Assert.assertTrue(loginPage.loginErrorMessageLabel.getText().equals(expectedErrorMessage));
    }

    @And("user should not be logged in")
    public void user_should_not_be_logged_in() {
        String loginUrl = "http://crater.primetech-apps.com/login";
        //verify that login url didn't changes , meaning we are still in the same page and we couldn't login
        Assert.assertTrue(driver.getCurrentUrl().equals(loginUrl));
        Driver.closeDriver();//close the driver
    }

}