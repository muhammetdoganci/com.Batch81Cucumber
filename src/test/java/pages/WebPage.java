package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebPage {
    public WebPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='LOGIN PORTAL']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passWord;




}
