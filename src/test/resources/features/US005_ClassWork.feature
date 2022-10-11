Feature: US005 Class Work

  Scenario: TC01 kullanici gcerli bilgilerle giris yapar
    Given kullanici "blueRentACarUrl" sayfasina gider
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir