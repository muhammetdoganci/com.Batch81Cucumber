package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HmcPage;
import utilities.ConfigReader;

public class HMCStepDefinition {
    HmcPage hmcPage = new HmcPage();

    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        hmcPage.login.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmcPage.userName.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("HMCValidPasword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.signInButon.click();
    }

    @Then("Sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hmcPage.girisYapildi.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("HMCWrongPasword"));
    }

    @Then("Sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.userName.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }


    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String user) {
        hmcPage.userName.sendKeys(user);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hmcPage.password.sendKeys(password);
    }
}
