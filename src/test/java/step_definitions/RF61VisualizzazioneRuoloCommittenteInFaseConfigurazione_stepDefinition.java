package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClickOK_Page;
import pages.RF61VisualizzazioneRuoloCommittenteInFaseConfigurazione_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF61VisualizzazioneRuoloCommittenteInFaseConfigurazione_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    RF61VisualizzazioneRuoloCommittenteInFaseConfigurazione_Page rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page = new RF61VisualizzazioneRuoloCommittenteInFaseConfigurazione_Page();
    @Given("L utente  inserisce usernamext {int}  password  M1k1am0?glce clicca sul bottone Log In")
    public void l_utente_inserisce_usernamext_password_m1k1am0_glce_clicca_sul_bottone_log_in(Integer int1) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L utente  clicca  sulpannello Project  Configurator")
    public void l_utente_clicca_sulpannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.ClickLogin.click();
        if(!rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.prijectConfigClick.click();
        }
    }
    @Then("L utente  selezionaorganizzazioneSSD-RIT-REI-ARI  Cagliari")
    public void l_utente_selezionaorganizzazione_ssd_rit_rei_ari_cagliari() {
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L utente  seleziona laWBS TE-ER-{int} {int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) {
        if(!rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.SelezionaCagliari.click();
        }
        if(!rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.SelezionaUNAWBS.click();
        }
        if(!rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickDropDownRomaEast.click();
        }
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickFrecetaDestra.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("l utente clicca su Creazione Cantiere")
    public void l_utente_clicca_su_creazione_cantiere() throws InterruptedException {
       rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickCreazioneCantiere.click();
        Thread.sleep(sleep);
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickAggiungi.click();
        Thread.sleep(sleep);
    }
    @When("L'utente inserisce i seguenti dati Nome Cantiere automaticoDescrizione prova test1Tipologia Mistoe clicca sull'icona di salvataggio")
    public void l_utente_inserisce_i_seguenti_dati_nome_cantiere_automatico_descrizione_prova_test1tipologia_mistoe_clicca_sull_icona_di_salvataggio() throws InterruptedException {
   rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.nomeaAutomatico.sendKeys("Automatico");
        Thread.sleep(sleep);
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.Descrizione.sendKeys("test1");
        Thread.sleep(sleep);
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.tipologia.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente seleziona il pulsante Configura relativo al cantiereTE-ER-{int}-{int}_CN_{int}")
    public void l_utente_seleziona_il_pulsante_configura_relativo_al_cantiere_te_er__cn(Integer int1, Integer int2, Integer int3) throws InterruptedException {
    rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickMisto.click();
        Thread.sleep(sleep);
    rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickSalva.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickConfigura.click();
        Thread.sleep(2000);
    }
    @When("L'utente seleziona l'icona relativa all'organigramma di cantiere")
    public void l_utente_seleziona_l_icona_relativa_all_organigramma_di_cantiere() throws InterruptedException {
   rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.organigrammantiere.click();
        Thread.sleep(sleep);
        rf61VisualizzazioneRuoloCommittenteInFaseConfigurazione_page.clickRuoli.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }

}
