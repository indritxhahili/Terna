@RF51LineeAereeCampate @Terna
Feature: "Accesso con utenza PU (o altre con permessi nella sezione
  Devono essere presenti almeno 2 sostegni per creare una campata"

  Scenario: Verificare il corretto funzionamento della sezione, il cui il legame tra la consistenza sarà con la WBS e non con il cantiere
    Given Lutente inserisce username xt3533 1am0?gl e clicca sul bottone Log In
    Then Lutente clicca sul  pannello Project Configurator
    And Lutente seleziona lorganizzazione SSD-RIT-REI-ARI Cagliari
    And Lutente seleziona la WBS TE-ER-21-012-Reattore 380 kV SE Roma Est e clicca la freccia a destra
    When Lutente clicca sulla voce Consistenze
    And Lutente clicca sul bottone Aggiungi nella tabella relativa ai sostegni
    Then "L'utente inserisce i seguenti dati Codice picchetto automatico2Regione Lazio Comune Roma Serie sostegno
    And L utente clicca sul bottone Aggiungi nella tabella relativa ai sostegni
    Then "L'utente inserisce i seguenti dati: Codice picchetto: automatico3 Regione: Lazio Comune Roma Serie sostegno NORM Altezza
    And L'utente clicca il bottone Aggiungi nella tabella relativa alle campate posizionata sotto la tabella sostegni
    Then "L'utente inserisce i seguenti dati Codice sostegno dropdown menu automatico Codice sostegno dropdown menu Denominazione automaticampat Lunghezza



