package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;

public class DataTablesStepDefinitions {
    DataTablePage dataTablesPage = new DataTablePage();

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablesPage.newButonu.click();
    }

    @And("firstname kutusuna {string} girer")
    public void firstnameKutusunaGirer(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);

    }

    @And("lastname kutusuna {string} girer")
    public void lastnameKutusunaGirer(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);
    }

    @And("position kutusuna {string} girer")
    public void positionKutusunaGirer(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("office kutusuna {string} girer")
    public void officeKutusunaGirer(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("extension kutusuna {string} girer")
    public void extensionKutusunaGirer(String extension) {
        dataTablesPage.extension.sendKeys(extension);

    }

    @And("startDate kutusuna {string} girer")
    public void startdateKutusunaGirer(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @And("salary kutusuna {string} girer")
    public void salaryKutusunaGirer(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        dataTablesPage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablesPage.searchIsım.sendKeys(firstName);
    }


    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstName) {
        Assert.assertTrue(dataTablesPage.searchIsımSonucDogrulama.getText().contains(firstName));
    }
}
