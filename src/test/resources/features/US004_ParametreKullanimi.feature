Feature: US004 Parametre Kullanimi

  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://www.trendyol.com" sayfasina gider
    And sayfada 1 saniye bekler
    Then url'in "trend" icerdigini test eder
    And sayfayi kapatir
