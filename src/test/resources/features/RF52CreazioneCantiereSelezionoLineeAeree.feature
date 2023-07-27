@RF52CreazioneCantiereSelezionoLineeAeree @Terna
Feature: Accesso con utenza PU (o altre con permessi nella sezione)

  Scenario: Verificare che in fase di creazione cantiere sia possibile selezionare solo l'opzione linee aeree
    Given L utente inserisce username  xt3533 password M1k1am0?glce clicca sul  bottone Log In"
    Then L utente clicca sul pannello Project Configurator
    And L utente seleziona l organizzazione:SSD-RIT-REI-ARI Cagliari
    And L utente seleziona la WBS TE-ER-21-012-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    When L utente clicca sulla voce Creazione cantiere
    And L utente clicca il bottone Aggiungi
    Then L utente inserisce i seguenti dati Id cantiere non configurabile Nome Cantiere aereo- Descrizione cantiere aereo automatico Tipologia dropdown
    And L utente clicca sul bottone Configura
    Then L utente clicca sul bottone Consistenze cantiere