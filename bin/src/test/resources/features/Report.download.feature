Feature: Here we have to locate all needed information , the point is
  to do catch some locators to do unit testing and to do some
  download for these pages


  Scenario: this is the step for downloading the Report
    Given User should go in webPage
    Then User should put username correct
    And user should put the passwsword
    Then User should LOGin
    And User shoul acceppt the title Splash
    Then user should open the nome Cognome
    And User should search on search Box
    When usershould put Name Giovanni
    And user should open MenuMensa
    Then User should Open Report Menu
    Then Prospetto prestazione


