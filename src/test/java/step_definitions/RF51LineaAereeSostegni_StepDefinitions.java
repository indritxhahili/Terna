package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.ClickOK_Page;
import pages.RF51LineeAereeSostegni_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF51LineaAereeSostegni_StepDefinitions {
    RF51LineeAereeSostegni_Page rf51LineeAereeSostegni_page = new RF51LineeAereeSostegni_Page();
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    @Given("L'utente inserisce  username password M1k1am0?glce clicca sul botnet Log In")
    public void l_utente_inserisce_username_password_m1k1am0_glce_clicca_sul_botnet_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.CLickUsername.sendKeys("xt3533");
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L'utente clicca sul  pannello  Project Configurator")
    public void l_utente_clicca_sul_pannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.ClickLogin.click();
        if(!rf51LineeAereeSostegni_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf51LineeAereeSostegni_page.prijectConfigClick.click();
        }
    }
    @Then("L'utente seleziona lorganizzazioneSSD RIT REI ARI Cagliari")
    public void l_utente_seleziona_lorganizzazione_ssd_rit_rei_ari_cagliari() {
        rf51LineeAereeSostegni_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("L'utente  seleziona la WBS: TE-ER Reattore  kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra() {
        if(!rf51LineeAereeSostegni_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf51LineeAereeSostegni_page.SelezionaCagliari.click();
        }

    }
    @When("L'utente clicca sulla voce  Consistenze")
    public void l_utente_clicca_sulla_voce_consistenze() {
        if(!rf51LineeAereeSostegni_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf51LineeAereeSostegni_page.SelezionaUNAWBS.click();
        }
    }
    @When("L'utente clicca sul bottone Aggiungi nella tabella relativa ai sostegni")
    public void l_utente_clicca_sul_bottone_aggiungi_nella_tabella_relativa_ai_sostegni() throws InterruptedException {
        if(!rf51LineeAereeSostegni_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf51LineeAereeSostegni_page.clickDropDownRomaEast.click();
        }
        rf51LineeAereeSostegni_page.clickFrecetaDestra.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.clickConsistenza.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!rf51LineeAereeSostegni_page.agguingiClick.isDisplayed()){
            Thread.sleep(sleep);
            rf51LineeAereeSostegni_page.agguingiClick.click();
        }else
            rf51LineeAereeSostegni_page.agguingiClick.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente inserisce i seguenti dati Codice picchetto automatico1 Regione Lazio Comune Roma Serie sostegno NORM Altezza\"")
    public void l_utente_inserisce_i_seguenti_dati_codice_picchetto_automatico1_regione_lazio_comune_roma_serie_sostegno_norm_altezza() throws InterruptedException {
        rf51LineeAereeSostegni_page.codicePicchetto.sendKeys("automatico1");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeSostegni_page.DropdownRegione.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.clickLzioDropdwon.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.comuneDropdown.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.CommuneRoma.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.serieDropdwon.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.CLickNorm.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.marca.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.clickDentroMarca.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.ClickAltezza.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.click5NellaAltezza.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.tipologia.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.AmaroTipologia.click();
        Thread.sleep(sleep);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,200)","");
        rf51LineeAereeSostegni_page.latitudineCLick.sendKeys("42");
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.Longitudine.sendKeys("10");
        Thread.sleep(sleep);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", rf51LineeAereeSostegni_page.liveloDiTensione);
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.liveloDiTensione.click();
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.click380KW.click();
        Thread.sleep(sleep);
        js.executeScript("window.scrollBy(0,400)","");
        Thread.sleep(sleep);
        rf51LineeAereeSostegni_page.SalvaClick.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }
}
