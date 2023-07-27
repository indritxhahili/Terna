package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.ClickOK_Page;
import pages.RF56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    RF56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_Page rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page = new RF56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_Page();
    @Given("Lutente  inserisce  usernamext3533  password  M1k1am0?glce clicca sul bottone Log In")
    public void lutente_inserisce_usernamext3533_password_m1k1am0_glce_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L utente  clicca sulpannello  Project  Configurator")
    public void l_utente_clicca_sulpannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.ClickLogin.click();
        if(!rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.prijectConfigClick.click();
        }
    }
    @Then("Lutente  selezionaorganizzazione  SSD- RIT-REI-ARI  Cagliari")
    public void lutente_selezionaorganizzazione_ssd_rit_rei_ari_cagliari() {
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("Lutente  seleziona laWBS TE-ER-{int}-{int}- Reattore {int}  kV SE Roma Est e clicca la freccia a destra")
    public void lutente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) {
        if(!rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.SelezionaCagliari.click();
        }
        if(!rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.SelezionaUNAWBS.click();
        }
        if(!rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.clickDropDownRomaEast.click();
        }
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.clickFrecetaDestra.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("Lutente  clicca sulla  voce  {string}")
    public void lutente_clicca_sulla_voce(String string) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,600)","");
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.OrganigrammaDiCantiere.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.qualsiasiDropDown.click();
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.clickSecondDropDown.click();
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereInserimentoLucchetto_2_stepCreazione_page.ruoli.click();
        Thread.sleep(sleep);
        js.executeScript("window.scrollBy(0,600)","");
        Thread.sleep(sleep);
        Driver.closeDriver();
    }
}
