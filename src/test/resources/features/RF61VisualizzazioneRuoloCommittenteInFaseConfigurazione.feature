@RF61VisualizzazioneRuoloCommittenteInFaseConfigurazione @Terna
Feature:Accesso con utenza PU o altre con permessi nella sezione

  Scenario:Visualizzazione delle Card presenti all'interno del Project Configurator
    Given L utente  inserisce usernamext 3533  password  M1k1am0?glce clicca sul bottone Log In
    Then L utente  clicca  sulpannello Project  Configurator
    And L utente  selezionaorganizzazioneSSD-RIT-REI-ARI  Cagliari
    And L utente  seleziona laWBS TE-ER-21 012-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    And l utente clicca su Creazione Cantiere
    When L'utente inserisce i seguenti dati Nome Cantiere automaticoDescrizione prova test1Tipologia Mistoe clicca sull'icona di salvataggio
    Then L'utente seleziona il pulsante Configura relativo al cantiereTE-ER-21-012_CN_38
    When L'utente seleziona l'icona relativa all'organigramma di cantiere

