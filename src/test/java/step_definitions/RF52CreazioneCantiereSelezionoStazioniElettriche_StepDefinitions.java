package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClickOK_Page;
import pages.RF52CreazioneCantiereSelezionoStazioniElettriche_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF52CreazioneCantiereSelezionoStazioniElettriche_StepDefinitions {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    RF52CreazioneCantiereSelezionoStazioniElettriche_Page rf52CreazioneCantiereSelezionoStazioniElettriche_page = new RF52CreazioneCantiereSelezionoStazioniElettriche_Page();
    @Given("L utente  inserisce username  xt3533 password M1k1am0?glce clicca sul bottone Log In")
    public void l_utente_inserisce_username_xt3533_password_m1k1am0_glce_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L utente  clicca sul pannello Project  Configurator")
    public void l_utente_clicca_sul_pannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.ClickLogin.click();
        if(!rf52CreazioneCantiereSelezionoStazioniElettriche_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf52CreazioneCantiereSelezionoStazioniElettriche_page.prijectConfigClick.click();
        }
    }
    @Then("L utente  seleziona l organizzazione SSD-RIT-REI-ARI Cagliari")
    public void l_utente_seleziona_l_organizzazione_ssd_rit_rei_ari_cagliari() {
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L utente  seleziona la  WBS TE-ER-{int}-{int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) {
        if(!rf52CreazioneCantiereSelezionoStazioniElettriche_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf52CreazioneCantiereSelezionoStazioniElettriche_page.SelezionaCagliari.click();
        }
    }
    @When("L utente  clicca sulla voce Creazione  cantiere")
    public void l_utente_clicca_sulla_voce_creazione_cantiere() throws InterruptedException {
        if(!rf52CreazioneCantiereSelezionoStazioniElettriche_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf52CreazioneCantiereSelezionoStazioniElettriche_page.SelezionaUNAWBS.click();
        }
        if(!rf52CreazioneCantiereSelezionoStazioniElettriche_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf52CreazioneCantiereSelezionoStazioniElettriche_page.clickDropDownRomaEast.click();
        }
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.clickFrecetaDestra.click();
        Thread.sleep(sleep);
    }
    @When("L utente  clicca il  bottone Aggiungi")
    public void l_utente_clicca_il_bottone_aggiungi() throws InterruptedException {
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.CreazioneCantiere.click();
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.aggiungi.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente inserisce i seguenti dati Id cantiere non configurabile Nome Cantiere stazioniDescrizione cantiere stazioni automaticoTipologia")
    public void l_utente_inserisce_i_seguenti_dati_id_cantiere_non_configurabile_nome_cantiere_stazioni_descrizione_cantiere_stazioni_automatico_tipologia() throws InterruptedException {
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.click_Nome_Cantiere.sendKeys("cantiere stazioni");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.clickDiscrizioneCntiere.sendKeys("cantiere stazioni automatico");
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.clickTipologiaDropdownMenu.click();
        Thread.sleep(sleep);
    }
    @Then("L utente  clicca sul  bottone Configura")
    public void l_utente_clicca_sul_bottone_configura() throws InterruptedException {
     rf52CreazioneCantiereSelezionoStazioniElettriche_page.clickCantiereStazioni.click();
        Thread.sleep(sleep);
    }
    @Then("L utente clicca sul bottone  Consistenze  cantiere")
    public void l_utente_clicca_sul_bottone_consistenze_cantiere() throws InterruptedException {
        rf52CreazioneCantiereSelezionoStazioniElettriche_page.salva_Click.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }

}
