package step_definitions;
import Pages.INV000023Page;
import Pages.InvoicesPage;
import Pages.LoginPage;
import Pages.SettingsPage;
import Utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Invoices_StepDef {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    SettingsPage settingsPage = new SettingsPage();
    InvoicesPage invoicesPage = new InvoicesPage();
    INV000023Page inv000023Page = new INV000023Page();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));


    @When("user clicks on Invoices")
    public void user_clicks_on_invoices() {
        settingsPage.invoicesButton.click();
        wait.until(ExpectedConditions.visibilityOf(invoicesPage.labelInvoices));
    }
    @Then("user should be navigated to the Invoices page")
    public void user_should_be_navigated_to_the_invoices_page() {
        System.out.println("Current URL is: " +driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("http://crater.primetech-apps.com/admin/invoices"));
    }
    @Then("user should see Invoices label should be displayed")
    public void user_should_see_invoices_label_should_be_displayed() {
        invoicesPage.labelInvoices.isDisplayed();
    }
    @Then("user should see the pagination should be displayed as {string}")
    public void user_should_see_the_pagination_should_be_displayed_as(String expectedPaginationLabel) {
        invoicesPage.invoicesPagination.isDisplayed();
        System.out.println(invoicesPage.invoicesPagination.getText());
    }

    @When("user clicks on pagination-next")
    public void user_clicks_on_pagination_next() throws InterruptedException {
        invoicesPage.nextPageButton.click();
        Thread.sleep(2000);
    }
    @Then("user should be directed to the next page")
    public void user_should_be_directed_to_the_next_page() {
        boolean originalPageItemIsInvisible = wait.until(ExpectedConditions.invisibilityOf(invoicesPage.adilaInv000023));
        Assert.assertTrue(originalPageItemIsInvisible);
    }
    @When("user clicks on pagination-previous")
    public void user_clicks_on_pagination_previous() {
        invoicesPage.previousPageButton.click();
        wait.until(ExpectedConditions.visibilityOf(invoicesPage.adilaInv000023));
    }
    @Then("user should be directed to the previous page")
    public void user_should_be_directed_to_the_previous_page() {
        Assert.assertTrue(invoicesPage.adilaInv000023.isDisplayed());
    }

    @When("user clicks on a specific invoice")
    public void user_clicks_on_a_specific_invoice() {
        invoicesPage.adilaInv000023.click();
        wait.until(ExpectedConditions.visibilityOf(inv000023Page.adilaInv000023Label));
    }
    @Then("user should see that the invoice details are displayed on the right side of the screen")
    public void user_should_see_that_the_invoice_details_are_displayed_on_the_right_side_of_the_screen() {
        inv000023Page.adilaInv000023Label.isDisplayed();

    }
}
