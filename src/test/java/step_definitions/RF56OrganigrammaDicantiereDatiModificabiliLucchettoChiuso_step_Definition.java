package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.ClickOK_Page;
import pages.RF56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_step_Definition {
    RF56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_Page rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page = new RF56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_Page();
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    @Given("L'utente inserisce username  xt3533 password M1k1am0?glce clicca subl bottone Log In")
    public void l_utente_inserisce_username_xt3533_password_m1k1am0_glce_clicca_subl_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.ClickPassword.sendKeys("M1k1am0?glc");
    }

    @Then("L'utente clicca sul pannell o Project Configurator")
    public void l_utente_clicca_sul_pannell_o_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.ClickLogin.click();
        if(!rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.prijectConfigClick.click();
        }
    }
    @Then("L'utente seleziona l' organizzazione:SSD-RIT-REI-ARI Cagliari")
    public void l_utente_seleziona_l_organizzazione_ssd_rit_rei_ari_cagliari() {
        rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L'utente seleziona la WBS: TE-ER-{int}-{int} {int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3, Integer int4) {
        if(!rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.SelezionaCagliari.click();
        }
        if(!rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.SelezionaUNAWBS.click();
        }
        if(!rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.clickDropDownRomaEast.click();
        }
        rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.clickFrecetaDestra.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L'utente clicca sulla voce Organigramma di cantiere")
    public void l_utente_clicca_sulla_voce_organigramma_di_cantiere() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,600)","");
        Thread.sleep(sleep);
        rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.organigramaCantiere.click();
    }
    @Then("l'utente seleziona il cantiere:TE-ER-{int}-{int}_CN_{int}")
    public void l_utente_seleziona_il_cantiere_te_er__cn(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        Thread.sleep(sleep);
    rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.clickDropDown.click();
        Thread.sleep(sleep);
      rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.click14_DropDown.click();
        Thread.sleep(sleep);
    }
    @When("L'utente prova a cliccare in uno qualsiasi dei ruolo modificabili con l'icona del lucchetto chiusa")
    public void l_utente_prova_a_cliccare_in_uno_qualsiasi_dei_ruolo_modificabili_con_l_icona_del_lucchetto_chiusa() throws InterruptedException {
     rf56OrganigrammaDicantiereDatiModificabiliLucchettoChiuso_page.elementoOcchio.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }
}
