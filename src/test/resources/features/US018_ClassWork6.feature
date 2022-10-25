Feature: US017 Class Work
  @US018
  Scenario: explicity wait
  Given kullanici "demoqaUrl" sayfasinda
When kullanici Visible After bes seconds butonunun gorunur olmasini bekler
And Visible After bes seconds butonunun gorunur oldugunu test eder