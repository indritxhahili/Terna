@RF50AssociazioniConsistenzeStazioniElettriche @Terna
Feature: Accesso con utenza PU (o altre con permessi nella sezione
         Il cantiere è abilitato alla sezione

  Scenario: Verificare che l'utente riesca ad effettuare l'associazione delle Consistenze già presenti lato cantiere per quanto riguarda le stazioni elettriche
    Given L'utente inserisce: username:  xt3533- password: M1k1am0?glce clicca sul bottone Log In
    Then L'utente clicca sul pannello Project  Configurator
    And L'utente seleziona l'organizzazione:  SSD-RIT-REI-ARI Cagliari
    And L'utente seleziona la WBS: TE-ER-21-012-Reattore 380 kV SE Roma  Est e clicca la freccia a destra
    When L'utente clicca  sulla voce Consistenze Cantiere
    And L'utente seleziona il cantiereTE-ER-21-012_CN_14
    Then L'utente seleziona il tab  "Stazioni elettriche"
    And L'utente seleziona  l'icona di associamento relativa al sostegno "stazione_noreg"
