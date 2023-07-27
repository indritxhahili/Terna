@RF50AssociazioneConsistenzeLineeIncavo @Terna
Feature: Verificare che l'utente riesca ad effettuare l'associazione delle
  Consistenze già presenti lato cantiere per quanto riguarda le linee in cavo

  Scenario: Accesso con utenza PU (o altre con permessi nella sezione Il cantiere è abilitato alla sezione
    Given L'utente inserisce:username: xt3533password: M1k1am0?glc e clicca sul bottone Log In
    Then L'utente  clicca sul pannello Project Configurator
    And L'utente seleziona l'organizzazione:SSD-RIT-REI-ARI Cagliari
    And L'utente seleziona la WBS: TE-ER-21-012-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    When L'utente clicca sulla voce Consistenze  Cantiere
    And L'utente seleziona il cantiere:TE-ER-21-012_CN_14
    Then L'utente seleziona il tab "Linee in cavo"
    And L'utente seleziona l'icona di associamento relativa al sostegno "terminale1_noreg"
