@SUNonConfigurato @Terna
Feature:Accesso con utenza PU o altre con permessi nella sezione

  Scenario:Visualizzazione delle Card presenti all'interno del Project Configurator
    Given L utente  inserisce  usernamext 3533  password  M1k1am0?glce clicca sul bottone  Log In
    Then L utente  clicca   sul pannello Project  Configurator
    And L utente  selezionaorganizzazio ne SSD-RIT-REI-ARI  Cagliari
    Then L'utente prova a selezionare il cantiere TE-FR-21-0C170L178re 380 kV SE SM Capua Vetere
