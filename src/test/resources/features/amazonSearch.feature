@All
Feature: Amazon Search

  @gp1
  Scenario: TC01 Kullanici amazonda nutella aratir
    Given kullanici amazon sayfasina gider
    Then kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder

  @gp2
  Scenario: TC02 Kullanici amazonda Selenium aratir
    Given kullanici amazon sayfasina gider
    Then kullanici Selenium aratir
    And sonuclarin Selenium icerdigini test eder

    @gp3
  Scenario: TC03 Kullanici amazonda iphone aratir
    Given kullanici amazon sayfasina gider
    Then kullanici iphone aratir
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir