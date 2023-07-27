Feature: here we have to test all the page inside of magazzine Viveri



  Scenario: firt we have to locate and use the key words
    Given User open google page
    Then User should put username
    Then User should put the password
    Then User should LogIn there
    Then User shoul click on Cognome Nome
    When user should click search botton
    Then User should put one name this case Giovanni
    And User should open page Magazzino viveri
    When User should put Lotti
    And User should put Fornitori
    Then User should open gestione Movimento
    And User should open Prevelamento mensa
    Then User should open Report Magazzino
    When User should open Gestione Reportisctica
    And User should open Fattura
    Then User should open verbale di buona