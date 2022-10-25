Feature: US015 Kullanici giris testi
  @US015
  Scenario: TC01 Kullanici sitede hesap olusturur
    Given kullanici "autoUrl" anasayfasina gider
    And kullanici sign in linkine tiklar
    And kullanici Create and account bölümüne email adresi girer
    And kullanici Create an Account butonuna basar
    And kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici Register butonuna basar
    Then kullanicinin hesap olusturgunu dogrulayin
    And sayfayi kapatir

