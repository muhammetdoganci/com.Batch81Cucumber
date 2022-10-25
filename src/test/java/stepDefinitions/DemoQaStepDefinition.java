package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoQaPage;
import utilities.Driver;

import java.time.Duration;

public class DemoQaStepDefinition {
    DemoQaPage demoqa = new DemoQaPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    @When("kullanici Visible After bes seconds butonunun gorunur olmasini bekler")
    public void kullaniciVisibleAfterBesSecondsButonununGorunurOlmasiniBekler() {
        wait.until(ExpectedConditions.visibilityOf(demoqa.visible));

    }

    @And("Visible After bes seconds butonunun gorunur oldugunu test eder")
    public void visibleAfterBesSecondsButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(demoqa.visible.isDisplayed());
    }
}
