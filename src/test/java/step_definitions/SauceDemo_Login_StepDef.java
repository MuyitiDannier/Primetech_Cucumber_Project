package step_definitions;

import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemo_Login_StepDef {

    WebDriver driver = Driver.getDriver();

    @Given("User is navigated to saucedemo.com")
    public void user_is_navigated_to_saucedemo_com() {
        driver.get("http://www.saucedemo.com");
    }
    @When("User enters {string} in the username field")
    public void user_enters_in_the_username_field(String userNameValue) {
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys(userNameValue);
    }
    @And("User enters {string} in the password field")
    public void user_enters_in_the_password_field(String passwordValue) {
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(passwordValue);
    }
    @And("User clicks on Login Button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
    }

    @Then("User is able to verify the {string} label is displayed")
    public void user_is_able_to_verify_the_label_is_displayed(String productLabel) {
        WebElement productLabelName = driver.findElement(By.xpath("//span[text()='Products']"));
//        if(productLabel.equals(productLabelName.getText())){
//            System.out.println("They are equal.");
//        }else{
//            System.out.println("Not equal.");
//        }
        Assert.assertEquals(productLabel, productLabelName.getText());
        Assert.assertTrue(productLabelName.isDisplayed());
    }

}
