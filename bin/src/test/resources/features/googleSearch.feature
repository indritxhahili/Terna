Feature: gogle search funcionality Agile story


  Scenario: Seesrch google title verifications
    When user is on google search page
    Then user should see title is google





    Scenario: search funcionality results title verifications
      Given user is on google search page
      When user types apple and click enter
      Then user sees apple in google search page

