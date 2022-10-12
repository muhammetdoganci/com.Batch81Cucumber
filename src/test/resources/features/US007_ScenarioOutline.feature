Feature: US007 Scenario Outline


  Scenario Outline: TC01 ConfigReader ile Scenerio Outline Kullanimi

    Given kullanici "<url>" sayfasinda
    Then sayfada 3 saniye bekler
    When sayfanın url'inin "<arananKelime>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | url | arananKelime |
      | fcbookUrl | facebook |
      | amazonUrl | amazon |
      | hmcUrl | hotel |
      | blueRentACarUrl | blue |
      | amznUrl | amazon |
