Feature: US016 Class Work4
  @US016
  Scenario: TC01 alerts and expilicitly wait
    Given kullanici "demoUrl" sayfasinda
    And  kullanici 5 saniye bekler
    When kullanici Alerts butonuna tiklar
    And  kullanici 5 saniye bekler
    And On button click, alert will appear after 5 seconds karsisindaki click me  butonuna basar
    And  kullanici 5 saniye bekler
    And Allert’in gorunur olmasini bekler
    And Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test  edin
    And kullanici ok diyerek alerti kapatir






