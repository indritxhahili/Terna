@BUSoloLetturaInFaseConsistenze @Terna
Feature:Verificare che nella sezione Consistenze all'interno del modulo Project Configurator, l'utente BU abbia solo possibilità di visualizzazione e non di editing

  Scenario:Verificare che nella sezione Consistenze all'interno del modulo Project Configurator, l'utente BU abbia solo possibilità di visualizzazione e non di editing

    Given L utente  inserisce usernamext  3533  password  M1k1am0?glce clicca sul bottone Log In
    Then L utente  clicca  sulpannello  Project  Configurator
    And L utente  selezionaorganizzazioneSSD- RIT-REI-ARI  Cagliari
    And L utente  seleziona laWBS TE- ER-21 012-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    And L'utente clicca suConsistenze
    Then L'utente seleziona il tab Linee in cavo
