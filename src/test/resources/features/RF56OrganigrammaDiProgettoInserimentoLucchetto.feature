@RF56OrganigrammaDiProgettoInserimentoLucchetto @Terna
Feature:Accesso con utenza PU o altre con permessi nella sezione

  Scenario:Visualizzazione delle Card presenti all'interno del Project Configurator
    Given Lutente  inserisce usernamext3533  password M1k1am0?glce clicca sul bottone Log In
    Then Lutente  clicca sulpannello Project  Configurator
    And Lutente  selezionaorganizzazione  SSD-RIT-REI-ARI Cagliari
    And Lutente  seleziona laWBS TE-ER-21-012-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    And L'utente clicca sulla voce  "Organigramma di progetto"