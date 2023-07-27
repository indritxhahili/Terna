package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ClickOK_Page;
import pages.RF54VsualizzazioneExOverviewProgettoSintesiWBS_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF54VsualizzazioneExOverviewProgettoSintesiWBS_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
     RF54VsualizzazioneExOverviewProgettoSintesiWBS_Page  rf54VsualizzazioneExOverviewProgettoSintesiWBS_page = new RF54VsualizzazioneExOverviewProgettoSintesiWBS_Page();
    @Given("L utente  inserisce usernamext3533  password M1k1am0?glce clicca sul bottone Log In")
    public void l_utente_inserisce_usernamext3533_password_m1k1am0_glce_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L utente  clicca sulpannello Project  Configurator")
    public void l_utente_clicca_sulpannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.ClickLogin.click();
        if(!rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.prijectConfigClick.click();
        }
    }
    @Then("L utente  selezionaorganizzazione  SSD-RIT-REI-ARI Cagliari")
    public void l_utente_selezionaorganizzazione_ssd_rit_rei_ari_cagliari() {
        rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L utente  seleziona laWBS TE-ER-{int}-{int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        if(!rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.SelezionaCagliari.click();
        }
        if(!rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.SelezionaUNAWBS.click();
        }
        if(!rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.clickDropDownRomaEast.click();
        }
        rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.clickFrecetaDestra.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente clicca sulla voce\"Consistenze\"")
    public void l_utente_clicca_sulla_voce_consistenze() throws InterruptedException {
        rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.consistenza.click();
        Thread.sleep(sleep);
        rf54VsualizzazioneExOverviewProgettoSintesiWBS_page.clickOcchio.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }

}
