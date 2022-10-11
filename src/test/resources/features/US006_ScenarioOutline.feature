Feature: US006 Scenario Outline

  Scenario Outline:

    Given kullanici "amazonUrl" sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    And kullanici sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir


    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella | nutella |
      | selenium | selenium |
      | java | java |