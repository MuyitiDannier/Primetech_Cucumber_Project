package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewItemPage {
    //Constructor
    public NewItemPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Elements:
    @FindBy(xpath = "//h3[@class='text-2xl font-bold text-left text-black']")
    public WebElement titleNewItem;

    @FindBy(xpath = "//input[@class='font-base block w-full sm:text-sm border-gray-200 rounded-md text-black focus:ring-primary-400 focus:border-primary-400']")
    public WebElement nameField;

    @FindBy(xpath = "//input[@class='font-base block w-full sm:text-sm border-gray-200 rounded-md text-black focus:ring-primary-400 focus:border-primary-400 v-money3']")
    public WebElement priceField;

    @FindBy(xpath = "//div[@class='p-0 relative mx-auto w-full flex items-center justify-end box-border cursor-pointer border border-gray-200 rounded-md bg-white text-sm leading-snug outline-none max-h-10']")
    public WebElement unitList;//Need to figure out which xpath is correct and how to click on List element.

    @FindBy(xpath = "//textarea[@name='description' and @class='box-border w-full px-3 py-2 text-sm not-italic font-normal leading-snug text-left text-black placeholder-gray-400 bg-white border border-gray-200 border-solid rounded outline-none focus:ring-primary-400 focus:border-primary-400']")
    public WebElement descriptionField;

    @FindBy(xpath = "//button[@class='inline-flex whitespace-nowrap items-center border font-medium focus:outline-none focus:ring-2 focus:ring-offset-2 px-4 py-2 text-sm leading-5 rounded-md border-transparent shadow-sm text-white bg-primary-600 hover:bg-primary-700 focus:ring-primary-500']")
    public WebElement saveItemButton;

}


