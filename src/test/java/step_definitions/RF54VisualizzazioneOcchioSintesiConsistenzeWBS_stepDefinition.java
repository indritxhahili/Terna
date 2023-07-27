package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ClickOK_Page;
import pages.RF54VisualizzazioneOcchioSintesiConsistenzeWBS_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF54VisualizzazioneOcchioSintesiConsistenzeWBS_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    RF54VisualizzazioneOcchioSintesiConsistenzeWBS_Page rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page = new RF54VisualizzazioneOcchioSintesiConsistenzeWBS_Page();
    @Given("L utente  inserisce username   xt3533  password M1k1am0?glce clicca sul bottone Log In")
    public void l_utente_inserisce_username_xt3533_password_m1k1am0_glce_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L utente  clicca sul   pannello Project  Configurator")
    public void l_utente_clicca_sul_pannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.ClickLogin.click();
        if(!rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.prijectConfigClick.click();
        }
    }
    @Then("L utente  seleziona  organizzazione  SSD-RIT-REI-ARI Cagliari")
    public void l_utente_seleziona_organizzazione_ssd_rit_rei_ari_cagliari() {
        rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L utente  seleziona   la  WBS TE-ER-{int}-{int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        if(!rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.SelezionaCagliari.click();
        }
        if(!rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.SelezionaUNAWBS.click();
        }
        if(!rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.clickDropDownRomaEast.click();
        }
        rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.clickFrecetaDestra.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente clicca sulla voce {string}")
    public void l_utente_clicca_sulla_voce(String string) throws InterruptedException {
    rf54VisualizzazioneOcchioSintesiConsistenzeWBS_page.consistenza.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }
}
