package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentACarPage {
    public BlueRentACarPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement userName;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signIn;

    @FindBy(xpath = "//*[text()='John Walker']")
    public WebElement basariliGirisDonut;






}
