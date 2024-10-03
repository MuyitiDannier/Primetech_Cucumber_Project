package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicesPage {
    //Constructor:
    public InvoicesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Elements:
    @FindBy(xpath = "//h3[@class='text-2xl font-bold text-left text-black' and text()='Invoices']")
    public WebElement labelInvoices;

    @FindBy(xpath = "//ol[@class='flex flex-wrap py-4 text-gray-900 rounded list-reset']")
    public WebElement invoicesPagination;

    @FindBy(xpath = "//a[@href='/admin/invoices/29/view' and @class='font-medium text-primary-500']")
    public WebElement adilaInv000023;

    @FindBy(xpath = "//a[@class='relative inline-flex items-center px-2 py-2 text-sm font-medium text-gray-500 bg-white border border-gray-300 rounded-r-md hover:bg-gray-50']")
    public WebElement nextPageButton;

    @FindBy(xpath = "//a[@class='relative inline-flex items-center px-2 py-2 text-sm font-medium text-gray-500 bg-white border border-gray-300 rounded-l-md hover:bg-gray-50']")
    public WebElement previousPageButton;
}

