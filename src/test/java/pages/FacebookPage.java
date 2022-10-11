package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signIn;

    @FindBy(xpath = "//*[text()='Girdiğin e-posta bir hesaba bağlı değil. ']")
    public WebElement sonucYazisi;

}
