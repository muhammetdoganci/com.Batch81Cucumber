package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class DemoStepDefinition {
    DemoPage demo = new DemoPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    @When("kullanici Alerts butonuna tiklar")
    public void kullaniciAlertsButonunaTiklar() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demo.alert.click();

    }
    @And("On button click, alert will appear after {int} seconds karsisindaki click me  butonuna basar")
    public void onButtonClickAlertWillAppearAfterSecondsKarsisindakiClickMeButonunaBasar(int arg0) {
        demo.clikcMe.click();
    }
    @And("Allert’in gorunur olmasini bekler")
    public void allertInGorunurOlmasiniBekler() throws InterruptedException {

        wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("Allert uzerindeki yazinin “This alert appeared after {int} seconds” oldugunu test  edin")
    public void allertUzerindekiYazininThisAlertAppearedAfterSecondsOldugunuTestEdin(int arg0) {
        String alertYazisi = Driver.getDriver().switchTo().alert().getText();
        String expectedAlertYazisi = "This alert appeared after 5 seconds";
        Assert.assertEquals(expectedAlertYazisi,alertYazisi);

    }

    @And("kullanici ok diyerek alerti kapatir")
    public void kullaniciOkDiyerekAlertiKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("kullanici Will enable bes seconds butonunun enable olmasini bekleyin")
    public void kullaniciWillEnableBesSecondsButonununEnableOlmasiniBekleyin() {
        wait.until(ExpectedConditions.elementToBeClickable(demo.enable));

    }

    @And("kullanici Will enable bes seconds butonunun enable oldugunu test eder")
    public void kullaniciWillEnableBesSecondsButonununEnableOldugunuTestEder() {
        Assert.assertTrue(demo.enable.isEnabled());
    }
}
