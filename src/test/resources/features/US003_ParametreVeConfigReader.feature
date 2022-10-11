Feature: US003 Parametre ve ConfigReader


  Scenario: TC01 Parametre ve ConfigReader kullanimi
    Given kullanici "fcbookUrl" sayfasina gider
    And sayfada 1 saniye bekler
    Then url'in "facebook" icerdigini test eder


  Scenario: TC02 Parametre ve ConfigReader kullanimi
    Given kullanici "amazonUrl" sayfasina gider
    And sayfada 1 saniye bekler
    Then url'in "amazon" icerdigini test eder

  Scenario: TC03 Parametre ve ConfigReader kullanimi
    Given kullanici "hmcUrl" sayfasina gider
    And sayfada 1 saniye bekler
    Then url'in "hotel" icerdigini test eder
    And sayfayi kapatir