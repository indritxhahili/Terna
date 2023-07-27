package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.ClickOK_Page;
import pages.RF51LineeAereeCampate_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF51LineeAereeCampate_StepDefinitons {
    RF51LineeAereeCampate_Page rf51LineeAereeCampate_page = new RF51LineeAereeCampate_Page();
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    @Given("Lutente inserisce username xt3533 1am0?gl e clicca sul bottone Log In")
    public void lutente_inserisce_username_xt3533_1am0_gl_e_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.CLickUsername.sendKeys("xt3533");
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("Lutente clicca sul  pannello Project Configurator")
    public void lutente_clicca_sul_pannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.ClickLogin.click();
        if(!rf51LineeAereeCampate_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf51LineeAereeCampate_page.prijectConfigClick.click();
        }
    }
    @Then("Lutente seleziona lorganizzazione SSD-RIT-REI-ARI Cagliari")
    public void lutente_seleziona_lorganizzazione_ssd_rit_rei_ari_cagliari() {
        rf51LineeAereeCampate_page.SelezionaUNorganizzazioneDropDown.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("Lutente seleziona la WBS TE-ER-{int}-{int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void lutente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) {
        if(!rf51LineeAereeCampate_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf51LineeAereeCampate_page.SelezionaCagliari.click();
        }
    }
    @When("Lutente clicca sulla voce Consistenze")
    public void lutente_clicca_sulla_voce_consistenze() {
        if(!rf51LineeAereeCampate_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf51LineeAereeCampate_page.SelezionaUNAWBS.click();
        }
    }
    @When("Lutente clicca sul bottone Aggiungi nella tabella relativa ai sostegni")
    public void lutente_clicca_sul_bottone_aggiungi_nella_tabella_relativa_ai_sostegni() throws InterruptedException {
        if(!rf51LineeAereeCampate_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            rf51LineeAereeCampate_page.clickDropDownRomaEast.click();
        }
        rf51LineeAereeCampate_page.clickFrecetaDestra.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickConsistenza.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (! rf51LineeAereeCampate_page.agguingiClick.isDisplayed()){
            Thread.sleep(sleep);
            rf51LineeAereeCampate_page.agguingiClick.click();
        }else
            rf51LineeAereeCampate_page.agguingiClick.click();
        Thread.sleep(sleep);
    }
    @Then("\"L'utente inserisce i seguenti dati Codice picchetto automatico2Regione Lazio Comune Roma Serie sostegno")
    public void l_utente_inserisce_i_seguenti_dati_codice_picchetto_automatico2regione_lazio_comune_roma_serie_sostegno() throws InterruptedException {
        rf51LineeAereeCampate_page.codicePicchetto.sendKeys("automatico2");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.DropdownRegione.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickLzioDropdwon.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.comuneDropdown.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.CommuneRoma.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.serieDropdwon.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.CLickNorm.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.marca.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickDentroMarca.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.ClickAltezza.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.click5NellaAltezza.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.tipologia.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.AmaroTipologia.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.latitudineCLick.sendKeys("42");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.Longitudine.sendKeys("10");
        Thread.sleep(sleep);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",  rf51LineeAereeCampate_page.liveloDiTensione);
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.liveloDiTensione.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.click380KW.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,400)","");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.SalvaClick.click();
        Thread.sleep(sleep);
        js.executeScript("window.scrollBy(0,-400)","");
        Thread.sleep(sleep);
    }
    @Then("L utente clicca sul bottone Aggiungi nella tabella relativa ai sostegni")
    public void l_utente_clicca_sul_bottone_aggiungi_nella_tabella_relativa_ai_sostegni() throws InterruptedException {
        if (! rf51LineeAereeCampate_page.agguingiClick.isDisplayed()){
            Thread.sleep(sleep);
            rf51LineeAereeCampate_page.agguingiClick.click();
        }else
            rf51LineeAereeCampate_page.agguingiClick.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.codicePicchetto.sendKeys("automatico3");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.clickRegione.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickLazio.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.comuneautomatico3.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickRomaAutomatico3.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.clickserieAutomatico3.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickNormAutomatico3.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.marca2.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickDentroMarca2.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickAltezzaAutomatico3.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.click10Automatico3.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickTipologiaAutomatico3.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.clickAmaroAutomatico3.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickLatitudineAutomatico3.sendKeys("43");
        Thread.sleep(sleep);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", rf51LineeAereeCampate_page.liveloTensione);
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.liveloTensione.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.click380LIveloTensione.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.clickLongitudineAutomatico3.sendKeys("10");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,400)","");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.SalvaClick.click();
    }
    @Then("\"L'utente inserisce i seguenti dati: Codice picchetto: automatico3 Regione: Lazio Comune Roma Serie sostegno NORM Altezza")
    public void l_utente_inserisce_i_seguenti_dati_codice_picchetto_automatico3_regione_lazio_comune_roma_serie_sostegno_norm_altezza() throws InterruptedException {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,600)","");
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.aggiungiCampate.click();
        Thread.sleep(sleep);
    }

    @Then("L'utente clicca il bottone Aggiungi nella tabella relativa alle campate posizionata sotto la tabella sostegni")
    public void l_utente_clicca_il_bottone_aggiungi_nella_tabella_relativa_alle_campate_posizionata_sotto_la_tabella_sostegni() throws InterruptedException {
      rf51LineeAereeCampate_page.codiceSostegno.click();
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      rf51LineeAereeCampate_page.clickAutomatico2DaCodiceSostegno.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.clickcodiceA_Automatico3.click();
        Thread.sleep(2000);
        rf51LineeAereeCampate_page.clickAutomatico3.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.automaticompataDenominazione.sendKeys("automaticapmata");
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       rf51LineeAereeCampate_page.lunghezza.sendKeys("10");
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.liveloTensione2.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.getClick380Tensione.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickTipoConduttori.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickPrimo.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.NumeroDiConduttori.sendKeys("10");
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.funeDiGuardia.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickPorimoFunoDiGuardia.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickFuneDiGuardia2.click();
        Thread.sleep(sleep);
        rf51LineeAereeCampate_page.clickPRIMOFunieDiGuardia2.click();
    }
    @Then("\"L'utente inserisce i seguenti dati Codice sostegno dropdown menu automatico Codice sostegno dropdown menu Denominazione automaticampat Lunghezza")
    public void l_utente_inserisce_i_seguenti_dati_codice_sostegno_dropdown_menu_automatico_codice_sostegno_dropdown_menu_denominazione_automaticampat_lunghezza() throws InterruptedException {
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rf51LineeAereeCampate_page.clickSalva.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }
}
