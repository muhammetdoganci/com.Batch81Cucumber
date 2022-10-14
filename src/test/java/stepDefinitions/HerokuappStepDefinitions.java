package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerokuAppPage;
import utilities.Driver;

public class HerokuappStepDefinitions {
    HerokuAppPage herokuAppPage = new HerokuAppPage();

    @Then("Add Element butona basar")
    public void addElementButonaBasar() {
        herokuAppPage.addButonu.click();
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuAppPage.deleteButonu.isDisplayed());
    }

    @And("Delete butonuna basarak butonu siler")
    public void deleteButonunaBasarakButonuSiler() {
        herokuAppPage.deleteButonu.click();
    }

    @Then("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {

        String deleteButonu="<button class=\"added-manually\" onclick=\"deleteElement()\">Delete</button>";
        Assert.assertFalse(Driver.getDriver().getPageSource().contains(deleteButonu));
    }
}
