package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {
    public AutoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//a[@class='login']")
    public WebElement login;

    @FindBy (xpath = "//input[@id='email_create']")
    public WebElement creatEmail;

    @FindBy (xpath = "//input[@id='id_gender1']")
    public WebElement radioButton;





}
