package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewInvoicePage {

    public NewInvoicePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h3[@class='text-2xl font-bold text-left text-black' and text()='New Invoice']")
    public WebElement newInvoiceLabel;
}
