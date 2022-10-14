Feature: data tables
  Scenario Outline: TC16 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" sayfasinda
    Then new butonuna basar
    And firstname kutusuna "<firstname>" girer
    And sayfada 1 saniye bekler
    And lastname kutusuna "<lastname>" girer
    And sayfada 1 saniye bekler
    And position kutusuna "<position>" girer
    And sayfada 1 saniye bekler
    And office kutusuna "<office>" girer
    And sayfada 1 saniye bekler
    And extension kutusuna "<extension>" girer
    And sayfada 1 saniye bekler
    And startDate kutusuna "<startDate>" girer
    And sayfada 1 saniye bekler
    And salary kutusuna "<salary>" girer
    And sayfada 1 saniye bekler
    And Create tusuna basar
    And sayfada 1 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    And sayfada 1 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular
    And sayfada 1 saniye bekler
    And sayfayi kapatir

    Examples:
      |firstname|lastname|position|office|extension|startDate|salary|
      |ali      |last    |qa      |ankara|UI       |2021-10-21|12000|
      |salih    |fast    |dev     |yozgat|BA       |2021-12-01|15000|
      |veli     |just    |sdet    |amasya|UI       |2018-10-12|17000|
      |selvi    |slow    |dev     |cankiri|PO      |2020-02-21|13000|
      |tali     |konar   |qa      |ankara|UI       |2019-05-30|19000|