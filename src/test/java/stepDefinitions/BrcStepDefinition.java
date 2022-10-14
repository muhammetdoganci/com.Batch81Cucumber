package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BlueRentACarPage;
import utilities.ConfigReader;

public class BrcStepDefinition {
    BlueRentACarPage brc = new BlueRentACarPage();
    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brc.login.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        assert brc.ikinciLogin.isDisplayed();
    }

    @And("kullanici gecersiz username girer")
    public void kullaniciGecersizUsernameGirer() {
        brc.userName.sendKeys("salladim@salladim.com");
    }

    @And("kullanici gecersiz password girer")
    public void kullaniciGecersizPasswordGirer() {
        brc.password.sendKeys("123456");
    }

    @And("kullanici Login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        brc.ikinciLogin.click();
    }
}
