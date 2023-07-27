@RF54VisualizzazioneOcchioSintesiConsistenzeWBS @Terna
Feature:Accesso con utenza PU o altre con permessi nella sezione

  Scenario:Visualizzazione delle Card presenti all'interno del Project Configurator
    Given L utente  inserisce username   xt3533  password M1k1am0?glce clicca sul bottone Log In
    Then L utente  clicca sul   pannello Project  Configurator
    And L utente  seleziona  organizzazione  SSD-RIT-REI-ARI Cagliari
    And L utente  seleziona   la  WBS TE-ER-21-012-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    And L'utente clicca sulla voce "Consistenze"