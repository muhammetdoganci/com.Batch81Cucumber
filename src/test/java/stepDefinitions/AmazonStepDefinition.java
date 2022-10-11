package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
public class AmazonStepDefinition {
    AmazonPage amazonObje = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://amazon.com");
    }
    @Then("kullanici nutella aratir")
    public void kullaniciNutellaAratir() {
        amazonObje.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
    @And("sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKelime = "Nutella";
        String actualSonuc = amazonObje.aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }
    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }
    @Then("kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonObje.aramaKutusu.sendKeys("Selenium", Keys.ENTER);
    }
    @And("sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKelime = "Selenium";
        String actualSonuc = amazonObje.aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }

    @Then("kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonObje.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime = "iphone";
        String actualSonuc = amazonObje.aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }

    @Then("kullanici {string} aratir")
    public void kullaniciAratir(String arananKelime) {
        amazonObje.aramaKutusu.sendKeys(arananKelime, Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualSonuc = amazonObje.aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }


    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenSayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenSayfa));
    }

    @Then("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String urldeArananKelime) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(urldeArananKelime));
    }

    @And("sayfada {int} saniye bekler")
    public void sayfadaSaniyeBekler(int beklenecekSure) {
        try {
            Thread.sleep(beklenecekSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonObje.aramaKutusu.sendKeys(istenenKelime, Keys.ENTER);
    }

    @And("kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String istenenKelime) {
        Assert.assertTrue(amazonObje.aramaSonucu.getText().contains(istenenKelime));
    }
}