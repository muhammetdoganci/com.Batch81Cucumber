Feature: US017 Class Work
  @US017
  Scenario: explictly wait
  Given kullanici "demoqaUrl" sayfasinda
  Then kullanici Will enable bes seconds butonunun enable olmasini bekleyin
  And kullanici Will enable bes seconds butonunun enable oldugunu test eder