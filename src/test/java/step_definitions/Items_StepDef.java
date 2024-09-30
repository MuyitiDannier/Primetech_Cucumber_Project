package step_definitions;

import Pages.ItemsPage;
import Pages.LoginPage;
import Pages.NewItemPage;
import Pages.SettingsPage;
import Utilities.Driver;
import Utilities.SeleniumUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class Items_StepDef {

    WebDriver driver = Driver.getDriver();//declaring the driver as global because it will be used across all the class
    LoginPage loginPage = new LoginPage();
    SettingsPage settingsPage = new SettingsPage();
    ItemsPage itemsPage = new ItemsPage();
    NewItemPage newItemPage = new NewItemPage();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //Items-Scenario
    @When("user click on Items")
    public void user_click_on_items() {
        settingsPage.itemsButton.click();
        wait.until(ExpectedConditions.urlContains("items"));
    }
    @Then("user should be navigated to the Items page")
    public void user_should_be_navigated_to_the_items_page() {
        String itemsPageUrl = "http://crater.primetech-apps.com/admin/items";
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        Assert.assertTrue(itemsPageUrl.equals(driver.getCurrentUrl()));
    }
    @When("user click on + Add Item")
    public void user_click_on_add_item() {
        itemsPage.addItemButton.click();
        wait.until(ExpectedConditions.urlContains("create"));
    }
    @Then("user should be navigated to New Item Page")
    public void user_should_be_navigated_to_new_item_page() {
        String newItemPageUrl = "http://crater.primetech-apps.com/admin/items/create";
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        Assert.assertTrue(newItemPageUrl.equals(driver.getCurrentUrl()));
    }

    @And("New Item fields should be displayed.")
    public void new_item_fields_should_be_displayed() {
        newItemPage.titleNewItem.isDisplayed();
    }

    @When("user enters {string} into the Name field")
    public void user_enters_into_the_name_field(String string) {
        SeleniumUtils.sendkeysWithActionsClass(newItemPage.nameField, "New Item");

    }
    @And("user enters {string} into the Price field")
    public void user_enters_into_the_price_field(String string) {
        SeleniumUtils.sendkeysWithActionsClass(newItemPage.priceField, "$12.99");
    }
    @And("user selects {string} in the Unit List")
    public void user_selects_in_the_unit_list(String string) {

    }

    @And("user enter {string} into the Description field")
    public void user_enter_into_the_description_field(String string) {
        SeleniumUtils.sendkeysWithActionsClass(newItemPage.descriptionField, "This item is new.");
    }

    @And("user clicks on the Save Item button")
    public void user_clicks_on_the_save_item_button() {
        wait.until(ExpectedConditions.elementToBeClickable(newItemPage.saveItemButton));
        newItemPage.saveItemButton.click();
    }

    @Then("user should be able to see that the new item is listed in the items table")
    public void user_should_be_able_to_see_that_the_new_item_is_listed_in_the_items_table() {

    }

}

