Feature: US004 Parametre Kullanimi

  Scenario: TC01 Parametre Kullanimi
    Given kullanici "https://www.facebook.com" sayfasina gider
    And sayfada 1 saniye bekler
    Then url'in "facebook" icerdigini test eder
