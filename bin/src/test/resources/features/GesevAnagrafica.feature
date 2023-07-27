Feature: dobbiamo testare seconda pagina di anagrafica


  Scenario: in questo step dobbiamo testare la anagrafica
    Given User should open googlePage and click
    Then User should write username
    Then User should write password
    And User should open MenuMensa
    Then User should open MenuAnagrafico
