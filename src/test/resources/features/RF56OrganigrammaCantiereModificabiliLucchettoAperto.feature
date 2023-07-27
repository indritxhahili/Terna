@RF56OrganigrammaCantiereModificabiliLucchettoAperto
Feature:Accesso con utenza PU (o altre con permessi nella sezione)

  Scenario:Verificare che nella sezione organigramma di progetto i dati associati ad un lucchetto aperto siano modificabili

    Given L'utent e inserisce username  xt3533 password M1k1am0?glce clicca subl bottone Log In
    Then L'utent e clicca sul pannell o Project Configurator
    And L'utent e seleziona l' organizzazione:SSD-RIT-REI-ARI Cagliari
    And  L'utent e seleziona la WBS: TE-ER-21-01 2-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    And  L'utent e clicca sulla voce Organigramma di cantiere
    Then l'utent e seleziona il cantiere:TE-ER-21-012_CN_14
    When L'utent e prova a cliccare in uno qualsiasi dei ruolo modificabili con l'icona del lucchetto chiusa
