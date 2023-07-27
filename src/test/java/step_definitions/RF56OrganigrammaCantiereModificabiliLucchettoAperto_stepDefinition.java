package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.ClickOK_Page;
import pages.RF56OrganigrammaCantiereModificabiliLucchettoAperto_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF56OrganigrammaCantiereModificabiliLucchettoAperto_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    RF56OrganigrammaCantiereModificabiliLucchettoAperto_Page rf56OrganigrammaCantiereModificabiliLucchettoAperto_page = new RF56OrganigrammaCantiereModificabiliLucchettoAperto_Page();
    @Given("L'utent e inserisce username  xt3533 password M1k1am0?glce clicca subl bottone Log In")
    public void l_utent_e_inserisce_username_xt3533_password_m1k1am0_glce_clicca_subl_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.CLickUsername.sendKeys("xt3533");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L'utent e clicca sul pannell o Project Configurator")
    public void l_utent_e_clicca_sul_pannell_o_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.ClickLogin.click();
        if(!rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.prijectConfigClick.click();
        }
    }
    @Then("L'utent e seleziona l' organizzazione:SSD-RIT-REI-ARI Cagliari")
    public void l_utent_e_seleziona_l_organizzazione_ssd_rit_rei_ari_cagliari() {
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L'utent e seleziona la WBS: TE-ER-{int}-{int} {int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utent_e_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3, Integer int4) {
        if(!rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.SelezionaCagliari.click();
        }
        if(!rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.SelezionaUNAWBS.click();
        }
        if(!rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.clickDropDownRomaEast.click();
        }
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.clickFrecetaDestra.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L'utent e clicca sulla voce Organigramma di cantiere")
    public void l_utent_e_clicca_sulla_voce_organigramma_di_cantiere() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,600)","");
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.organigramaCantiere.click();
    }
    @Then("l'utent e seleziona il cantiere:TE-ER-{int}-{int}_CN_{int}")
    public void l_utent_e_seleziona_il_cantiere_te_er__cn(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.clickDropDown.click();
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.click14_DropDown.click();
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.elementoOcchio.click();
        Thread.sleep(sleep);
    }
    @When("L'utent e prova a cliccare in uno qualsiasi dei ruolo modificabili con l'icona del lucchetto chiusa")
    public void l_utent_e_prova_a_cliccare_in_uno_qualsiasi_dei_ruolo_modificabili_con_l_icona_del_lucchetto_chiusa() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,400)","");
        Thread.sleep(sleep);
     rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.clickDropDownCollaudatore.click();
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.clickManuel_Giachetti.click();
        Thread.sleep(sleep);
        js.executeScript("window.scrollBy(0,600)","");
        Thread.sleep(sleep);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",  rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.clickSalva);
        Thread.sleep(sleep);
        rf56OrganigrammaCantiereModificabiliLucchettoAperto_page.clickSalva.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }
}
