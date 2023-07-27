package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BUSoloLetturaInFaseConsistenze_Page;
import pages.ClickOK_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class BUSoloLetturaInFaseConsistenze_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    BUSoloLetturaInFaseConsistenze_Page buSoloLetturaInFaseConsistenze_page = new BUSoloLetturaInFaseConsistenze_Page();
    @Given("L utente  inserisce usernamext  {int}  password  M1k1am0?glce clicca sul bottone Log In")
    public void l_utente_inserisce_usernamext_password_m1k1am0_glce_clicca_sul_bottone_log_in(Integer int1) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        buSoloLetturaInFaseConsistenze_page.CLickUsername.sendKeys("xt3533");
        Thread.sleep(sleep);
        buSoloLetturaInFaseConsistenze_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L utente  clicca  sulpannello  Project  Configurator")
    public void l_utente_clicca_sulpannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        buSoloLetturaInFaseConsistenze_page.ClickLogin.click();
        if(!buSoloLetturaInFaseConsistenze_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            Thread.sleep(sleep);
            buSoloLetturaInFaseConsistenze_page.prijectConfigClick.click();
        }
    }
    @Then("L utente  selezionaorganizzazioneSSD- RIT-REI-ARI  Cagliari")
    public void l_utente_selezionaorganizzazione_ssd_rit_rei_ari_cagliari() throws InterruptedException {
        if (!buSoloLetturaInFaseConsistenze_page.SelezionaUnorganizzazione.isEnabled()){
            System.out.println("Step two failed");
        }else
            System.out.println("Step two passed");
        buSoloLetturaInFaseConsistenze_page.SelezionaUnorganizzazione.click();
        Thread.sleep(sleep);
        buSoloLetturaInFaseConsistenze_page.ClickCagliari.click();
        Thread.sleep(sleep);
        buSoloLetturaInFaseConsistenze_page.SecondCLick.click();
        Thread.sleep(sleep);
        buSoloLetturaInFaseConsistenze_page.CLickReattore380kv.click();
        if (!buSoloLetturaInFaseConsistenze_page.FrecetaDestraAccedi.isEnabled()){
            System.out.println("Test KO");
        }else
            System.out.println("Test OK ");
        buSoloLetturaInFaseConsistenze_page.FrecetaDestraAccedi.click();
        Thread.sleep(sleep);
    }
    @Then("L utente  seleziona laWBS TE- ER-{int} {int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) throws InterruptedException {
    buSoloLetturaInFaseConsistenze_page.conistenza.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente clicca suConsistenze")
    public void l_utente_clicca_su_consistenze() throws InterruptedException {
    buSoloLetturaInFaseConsistenze_page.clickLineaInCavo.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente seleziona il tab Linee in cavo")
    public void l_utente_seleziona_il_tab_linee_in_cavo() {
    Driver.closeDriver();
    }
}
