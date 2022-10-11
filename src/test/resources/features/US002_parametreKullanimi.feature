Feature: US002 Parametre Kullanimi

  Background: ortak adimlar
    Given kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici Amazonda Parametreli Arama Yapar
    Then kullanici "iphone" aratir
    And sonuclarin "iphone" icerdigini test eder

  Scenario: TC02 Kullanici Amazonda Parametreli Arama Yapar
    Then kullanici "nutella" aratir
    And sonuclarin "nutella" icerdigini test eder

  Scenario: TC03 Kullanici Amazonda Parametreli Arama Yapar
    Then kullanici "kek" aratir
    And sonuclarin "kek" icerdigini test eder
    And sayfayi kapatir