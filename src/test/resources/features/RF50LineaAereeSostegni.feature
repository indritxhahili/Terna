@RF51LineeAereeSostegni @Terna
Feature: Accesso con utenza PU (o altre con permessi nella sezione)

  Scenario: Verificare  il corretto funzionamento della sezione, il cui il legame tra la consistenza sarà con la WBS e non con il cantiere
    Given L'utente inserisce  username password M1k1am0?glce clicca sul botnet Log In
    Then L'utente clicca sul  pannello  Project Configurator
    And L'utente seleziona lorganizzazioneSSD RIT REI ARI Cagliari
    And L'utente  seleziona la WBS: TE-ER Reattore  kV SE Roma Est e clicca la freccia a destra
    When L'utente clicca sulla voce  Consistenze
    And L'utente clicca sul bottone Aggiungi nella tabella relativa ai sostegni
    Then L'utente inserisce i seguenti dati Codice picchetto automatico1 Regione Lazio Comune Roma Serie sostegno NORM Altezza"