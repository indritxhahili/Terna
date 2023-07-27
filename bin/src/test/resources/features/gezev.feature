

@zerobank
Feature: This is the first step than we have to open the page of Gesev
  we need to test all the locators and all the possible things
  first we have to put the username and password
  later we have to click on login botton
  than later step by step


  Scenario:prima tasse su Gesev
    Given User should open the gesev page
    Then User should Click UserName
    Then User should Click password
    And User should LogIn




    Scenario:User should click nell menu ratelare
      Given User click on menu raterale
      Then User should click on Mensa
      Then enter Report
      Then Elenco nominativo
