package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClickOK_Page;
import pages.RF52CreazioneCantiereSelezionoMisto_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF52CreazioneCantiereSelezionoMisto_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    RF52CreazioneCantiereSelezionoMisto_Page rf52CreazioneCantiereSelezionoMisto_page = new RF52CreazioneCantiereSelezionoMisto_Page();
    @Given("L'utente inserisce username  xt3533 password M1k1am0?glce clicca sul bottone Log In")
    public void l_utente_inserisce_username_xt3533_password_m1k1am0_glce_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoMisto_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf52CreazioneCantiereSelezionoMisto_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L'utente cliccaa sul pannello Project  Configurator")
    public void l_utente_cliccaa_sul_pannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoMisto_page.ClickLogin.click();
        if(!rf52CreazioneCantiereSelezionoMisto_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf52CreazioneCantiereSelezionoMisto_page.prijectConfigClick.click();
        }
    }
    @Then("L'utente seleziona   l'organizzazione SSD-RIT-REI-ARI Cagliari")
    public void l_utente_seleziona_l_organizzazione_ssd_rit_rei_ari_cagliari() {
        rf52CreazioneCantiereSelezionoMisto_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L'utente seleziona la WBS TE-ER-{int}-{int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) {
        if(!rf52CreazioneCantiereSelezionoMisto_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf52CreazioneCantiereSelezionoMisto_page.SelezionaCagliari.click();
        }
    }
    @When("L'utente clicca sulla voce Creazione cantiere")
    public void l_utente_clicca_sulla_voce_creazione_cantiere() throws InterruptedException {

        if(!rf52CreazioneCantiereSelezionoMisto_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf52CreazioneCantiereSelezionoMisto_page.SelezionaUNAWBS.click();
        }
        if(!rf52CreazioneCantiereSelezionoMisto_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf52CreazioneCantiereSelezionoMisto_page.clickDropDownRomaEast.click();
        }
        rf52CreazioneCantiereSelezionoMisto_page.clickFrecetaDestra.click();
        Thread.sleep(sleep);
    }
    @When("L'utente clicca il bottone Aggiungi")
    public void l_utente_clicca_il_bottone_aggiungi() throws InterruptedException {
        rf52CreazioneCantiereSelezionoMisto_page.CreazioneCantiere.click();
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoMisto_page.aggiungi.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente inserisce i seguenti dati Id cantiere non configurabile Nome Cantiere misto- Descrizione: cantiere misto automatico Tipologia dropdown menu misto")
    public void l_utente_inserisce_i_seguenti_dati_id_cantiere_non_configurabile_nome_cantiere_misto_descrizione_cantiere_misto_automatico_tipologia_dropdown_menu_misto() throws InterruptedException {
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoMisto_page.click_Nome_Cantiere.sendKeys("cantiere misto");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf52CreazioneCantiereSelezionoMisto_page.clickDiscrizioneCntiere.sendKeys("cantiere misto automatico");
        Thread.sleep(sleep);
        rf52CreazioneCantiereSelezionoMisto_page.clickTipologiaDropdownMenu.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente clicca sul bottone Configura")
    public void l_utente_clicca_sul_bottone_configura() throws InterruptedException {
        rf52CreazioneCantiereSelezionoMisto_page.clickCantiereMisto.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente clicca sul bottone Consistenze cantiere")
    public void l_utente_clicca_sul_bottone_consistenze_cantiere() {
        rf52CreazioneCantiereSelezionoMisto_page.salva_Click.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }


}
