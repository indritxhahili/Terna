package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import pages.ClickOK_Page;
import pages.RF50_Associazione_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF50_Associazione_stepDefinitions {
       RF50_Associazione_Page rf50_associazione_page = new RF50_Associazione_Page();
       int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
       ClickOK_Page clickOK_page = new ClickOK_Page();
       @Test
    @Given("L'utente inserisce username xt3533password: M1k1am0?glc e clicca sul bottone Log In")
    public void l_utente_inserisce_username_xt3533password_m1k1am0_glc_e_clicca_sul_bottone_log_in() throws InterruptedException {
           Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
           Thread.sleep(sleep);
           clickOK_page.clickOk.click();
           Thread.sleep(sleep);
           rf50_associazione_page.CLickUsername.sendKeys("xt3533");
           Thread.sleep(sleep);
           rf50_associazione_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L'utente clicca sul pannello Project Configurator")
    public void l_utente_clicca_sul_pannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf50_associazione_page.ClickLogin.click();
        if(!rf50_associazione_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            Thread.sleep(sleep);
            rf50_associazione_page.prijectConfigClick.click();
        }
    }
    @Then("L'utente seleziona l'organizzazione: SSD-RIT-REI-ARI Cagliari")
    public void l_utente_seleziona_l_organizzazione_ssd_rit_rei_ari_cagliari() throws InterruptedException {
        if (!rf50_associazione_page.SelezionaUnorganizzazione.isEnabled()){
            System.out.println("Step two failed");
        }else
            System.out.println("Step two passed");
        rf50_associazione_page.SelezionaUnorganizzazione.click();
        Thread.sleep(sleep);
        rf50_associazione_page.ClickCagliari.click();
        Thread.sleep(sleep);
        rf50_associazione_page.SecondCLick.click();
        Thread.sleep(sleep);
        rf50_associazione_page.CLickReattore380kv.click();
        if (!rf50_associazione_page.FrecetaDestraAccedi.isEnabled()){
            System.out.println("Test KO");
        }else
            System.out.println("Test OK ");
    }
    @Then("L'utente seleziona la WBS: TE-ER-{int}-{int}-Reattore {int} kV SE Roma Est e clicca la freccia a destr")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destr(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        rf50_associazione_page.FrecetaDestraAccedi.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,400)","");
        Thread.sleep(sleep);
        rf50_associazione_page.ClickConsistenzeCantiere.click();
        Thread.sleep(sleep);
    }
    @When("L'utente clicca sulla voce Consistenze Cantiere")
    public void l_utente_clicca_sulla_voce_consistenze_cantiere() {
        rf50_associazione_page.ClickDropdwonCantiere.click();
        if (!rf50_associazione_page.clickFirstCntiere.isEnabled()){
            System.out.println("Test KO");
        }else
            System.out.println("Test OK");
    }
    @When("L'utente seleziona il cantiere: TE-ER-{int}-{int}_CN_{int}")
    public void l_utente_seleziona_il_cantiere_te_er__cn(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        rf50_associazione_page.clickFirstCntiere.click();
        Thread.sleep(sleep);
        rf50_associazione_page.CLickCarattereSpeciale.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }
}
