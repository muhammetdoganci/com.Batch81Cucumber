
Feature: Amazon Search


  Scenario: TC01 Kullanici amazonda nutella aratir
    Given kullanici amazon sayfasina gider
    Then kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder


  Scenario: TC02 Kullanici amazonda Selenium aratir
    Given kullanici amazon sayfasina gider
    Then kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullanici amazonda iphone aratir
    Given kullanici amazon sayfasina gider
    Then kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir