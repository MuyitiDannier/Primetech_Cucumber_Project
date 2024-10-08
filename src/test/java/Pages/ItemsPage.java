package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemsPage {
    //Constructor
    public ItemsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Elements:
    @FindBy(xpath = "//button[@class='inline-flex whitespace-nowrap items-center border font-medium focus:outline-none focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm leading-5 rounded-md border-transparent shadow-sm text-white bg-primary-600 hover:bg-primary-700 focus:ring-primary-500']")
    public WebElement addItemButton;

    @FindBy(xpath = "//a[text()='New Item']")
    public WebElement newItem;

    @FindBy(xpath = "//a[contains(@href, '/admin/items/')]")
    public List<WebElement> itemsList;

}
