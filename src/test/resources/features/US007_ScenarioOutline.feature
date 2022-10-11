Feature: US007 Scenario Outline


  Scenario: TC01 ConfigReader ile Scenerio Outline Kullanimi

    Given kullanici "fcbookUrl" sayfasina gider
    Then sayfada 3 saniye bekler
    When url'in "facebook" icerdigini test eder
    And sayfayi kapatir
