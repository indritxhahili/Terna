

Feature: wikipedia search funcionality
   and verifications



  Scenario: wiki Search Funcinality Title verification
    Given User is on Wikipedia home
    When User types "Elon Musk" in the wiki search box
    And User click search botton
    Then User should see "Elon Musk" is in wiki title


    Scenario: wikipwdia Search functinality
      Given User is on Wikipedia home
      When User types "Elon Musk" in the wiki search box
      And User click search botton
      Then User sees "Elon Musk" is in the main header





  Scenario Outline: Wikipedia Search Functionality Title Verificatio
      Given User is on Wikipedia home
      When User types "<searchValue>" in the wiki search box
      And User click search botton
    Then User should see "<expectedTitle>" is in wiki title
      Then User sees "<expectedMainHeader>" is in the main header

      Examples: search values we are going to be using in this scenario is as below
        | searchValue       | expectedTitle     | expectedMainHeader |
        | Steve Jobs        | Steve Jobs        | Steve Jobs         |
        | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
        | Bob Marley        | Bob Marley        | Bob Marley         |
        | Chuck Norris      | Chuck Norris      | Chuck Norris       |
        | Lionel Messi      | Lionel Messi      | Lionel Messi       |