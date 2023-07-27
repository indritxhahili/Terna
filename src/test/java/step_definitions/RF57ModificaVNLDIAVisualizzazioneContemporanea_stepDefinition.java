package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ClickOK_Page;
import pages.RF57ModificaVNLDIAVisualizzazioneContemporanea_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF57ModificaVNLDIAVisualizzazioneContemporanea_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    RF57ModificaVNLDIAVisualizzazioneContemporanea_Page  rf57ModificaVNLDIAVisualizzazioneContemporanea_page = new RF57ModificaVNLDIAVisualizzazioneContemporanea_Page();
    @Given("Lutente  inserisce usernamext {int}  password M1k1am0?glce clicca sul bottone Log In")
    public void lutente_inserisce_usernamext_password_m1k1am0_glce_clicca_sul_bottone_log_in(Integer int1) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf57ModificaVNLDIAVisualizzazioneContemporanea_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf57ModificaVNLDIAVisualizzazioneContemporanea_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("Lutente  clicca sulpannello Project Configurator")
    public void lutente_clicca_sulpannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf57ModificaVNLDIAVisualizzazioneContemporanea_page.ClickLogin.click();
        Thread.sleep(sleep);
        if(!rf57ModificaVNLDIAVisualizzazioneContemporanea_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf57ModificaVNLDIAVisualizzazioneContemporanea_page.prijectConfigClick.click();
            Thread.sleep(sleep);
        }
    }
    @Then("Lutente  selezionaorganizzazioneSSD-RIT-REI-ARI Cagliari")
    public void lutente_selezionaorganizzazione_ssd_rit_rei_ari_cagliari() {
        rf57ModificaVNLDIAVisualizzazioneContemporanea_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("Lutente  seleziona laWBS TE-ER-{int} {int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void lutente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        if(!rf57ModificaVNLDIAVisualizzazioneContemporanea_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf57ModificaVNLDIAVisualizzazioneContemporanea_page.SelezionaCagliari.click();
        }
        if(!rf57ModificaVNLDIAVisualizzazioneContemporanea_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf57ModificaVNLDIAVisualizzazioneContemporanea_page.SelezionaUNAWBS.click();
            Thread.sleep(sleep);
        }
        if(!rf57ModificaVNLDIAVisualizzazioneContemporanea_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf57ModificaVNLDIAVisualizzazioneContemporanea_page.clickDropDownRomaEast.click();
            Thread.sleep(sleep);
        }
        rf57ModificaVNLDIAVisualizzazioneContemporanea_page.clickFrecetaDestra.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L'utente clicca sulla voce\"Organigramma di progetto\"")
    public void l_utente_clicca_sulla_voce_organigramma_di_progetto() {
        rf57ModificaVNLDIAVisualizzazioneContemporanea_page.autorizzazione.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.closeDriver();
    }

}
