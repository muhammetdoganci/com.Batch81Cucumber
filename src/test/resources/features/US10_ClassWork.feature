Feature: US010 herokuTest

  Scenario: TC17 Herokuapp Test
    Given kullanici "herokuUrl" sayfasinda
    And sayfada 1 saniye bekler
    Then Add Element butona basar
    And sayfada 1 saniye bekler
    Then Delete butonunun gorunur oldugunu test eder
    And Delete butonuna basarak butonu siler
    Then sayfada 1 saniye bekler
    Then Delete butonunun gorunmedigini test edin
    And sayfayi kapatir