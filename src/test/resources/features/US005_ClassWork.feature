Feature: US005 Class Work

  Scenario: TC01 kullanici gcerli bilgilerle giris yapar
    Given kullanici "https://www.bluerentalcars.com/" sayfasina gider
    Then Login yazisina tiklar
    And kullanici gecersiz username girer
    And kullanici gecersiz password girer
    And kullanici Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir