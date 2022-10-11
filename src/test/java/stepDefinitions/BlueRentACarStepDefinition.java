package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BlueRentACarPage;
import utilities.ConfigReader;

public class BlueRentACarStepDefinition {

    BlueRentACarPage blueRentACarPage = new BlueRentACarPage();

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        blueRentACarPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        blueRentACarPage.userName.sendKeys(ConfigReader.getProperty("bracWrongUser"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        blueRentACarPage.password.sendKeys(ConfigReader.getProperty("bracWrongPassword"));
    }


    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        blueRentACarPage.signIn.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(blueRentACarPage.signIn.isDisplayed());
    }
}
