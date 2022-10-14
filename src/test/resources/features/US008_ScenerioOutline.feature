@US008
Feature: US008 Scenerio Outline

  Scenario Outline: TC01 Negative Login Scenerio Outline Test
    Given kullanici "hmcUrl" sayfasinda
    Then Log in yazisina tiklar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And Login butonuna basar
    Then Sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

    Examples:
      |username|password |
      |Manager5|Manager5!|
      |Manager6|Manager6!|
      |Manager7|Manager7!|
      |Manager8|Manager8!|
      |Manager9|Manager9!|