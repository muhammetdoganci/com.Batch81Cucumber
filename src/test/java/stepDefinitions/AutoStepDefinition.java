package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v99.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.Driver;

public class AutoStepDefinition {
    AutoPage auto = new AutoPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    @And("kullanici sign in linkine tiklar")
    public void kullaniciSignInLinkineTiklar() {
        auto.login.click();
    }

    @And("kullanici Create and account bölümüne email adresi girer")
    public void kullaniciCreateAndAccountBölümüneEmailAdresiGirer() {
        auto.creatEmail.sendKeys(faker.internet().emailAddress());


    }
    @And("kullanici Create an Account butonuna basar")
    public void kullaniciCreateAnAccountButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
    }

    @And("kullanici kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullaniciKisiselBilgileriniVeIletisimBilgileriniGirer() {
        auto.radioButton.click();
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.internet().password()).sendKeys(Keys.TAB).sendKeys("10").
                sendKeys(Keys.TAB).sendKeys("April").sendKeys(Keys.TAB).sendKeys("1985").
                sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.company().name()).
                sendKeys(Keys.TAB).sendKeys(faker.address().country()).sendKeys(Keys.TAB).
                sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys("kansa").sendKeys(Keys.TAB).
                sendKeys("Alaska").sendKeys(Keys.TAB).sendKeys("07100").sendKeys(Keys.TAB).
                sendKeys("United States").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).perform();


    }

    @And("kullanici Register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();

    }

    @Then("kullanicinin hesap olusturgunu dogrulayin")
    public void kullanicininHesapOlusturgunuDogrulayin() {
    }
}
