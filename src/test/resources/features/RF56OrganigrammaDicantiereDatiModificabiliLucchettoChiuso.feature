@RF56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso
Feature:Accesso con utenza PU (o altre con permessi nella sezione)

  Scenario: Verificare che nella sezione organigramma di progetto i dati associati ad un lucchetto chiuso non siano modificabili

    Given L'utente inserisce username  xt3533 password M1k1am0?glce clicca subl bottone Log In
    Then L'utente clicca sul pannell o Project Configurator
    And L'utente seleziona l' organizzazione:SSD-RIT-REI-ARI Cagliari
    And  L'utente seleziona la WBS: TE-ER-21-01 2-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    And  L'utente clicca sulla voce Organigramma di cantiere
    Then l'utente seleziona il cantiere:TE-ER-21-012_CN_14
    When L'utente prova a cliccare in uno qualsiasi dei ruolo modificabili con l'icona del lucchetto chiusa
