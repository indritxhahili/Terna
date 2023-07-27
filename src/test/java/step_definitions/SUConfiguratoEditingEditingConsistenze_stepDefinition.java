package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ClickOK_Page;
import pages.SUConfiguratoEditingEditingConsistenze_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class SUConfiguratoEditingEditingConsistenze_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    SUConfiguratoEditingEditingConsistenze_Page suConfiguratoEditingEditingConsistenze_page = new SUConfiguratoEditingEditingConsistenze_Page();
    @Given("L utente  inserisce usernamext {int}  password  M1k1am0?glce clicca sul bottone  Log In")
    public void l_utente_inserisce_usernamext_password_m1k1am0_glce_clicca_sul_bottone_log_in(Integer int1) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        suConfiguratoEditingEditingConsistenze_page.CLickUsername.sendKeys("xt3533");
        Thread.sleep(sleep);
        suConfiguratoEditingEditingConsistenze_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L utente  clicca   sulpannello Project  Configurator")
    public void l_utente_clicca_sulpannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        suConfiguratoEditingEditingConsistenze_page.ClickLogin.click();
        if(!suConfiguratoEditingEditingConsistenze_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            Thread.sleep(sleep);
            suConfiguratoEditingEditingConsistenze_page.prijectConfigClick.click();
        }
    }
    @Then("L utente  selezionaorganizzazio neSSD-RIT-REI-ARI  Cagliari")
    public void l_utente_selezionaorganizzazio_ne_ssd_rit_rei_ari_cagliari() throws InterruptedException {
        if (!suConfiguratoEditingEditingConsistenze_page.SelezionaUnorganizzazione.isEnabled()){
            System.out.println("Step two failed");
        }else
            System.out.println("Step two passed");
        suConfiguratoEditingEditingConsistenze_page.SelezionaUnorganizzazione.click();
        Thread.sleep(sleep);
        suConfiguratoEditingEditingConsistenze_page.ClickCagliari.click();
        Thread.sleep(sleep);
        suConfiguratoEditingEditingConsistenze_page.SecondCLick.click();
        Thread.sleep(sleep);
        suConfiguratoEditingEditingConsistenze_page.CLickReattore380kv.click();
        if (!suConfiguratoEditingEditingConsistenze_page.FrecetaDestraAccedi.isEnabled()){
            System.out.println("Test KO");
        }else
            System.out.println("Test OK ");
        suConfiguratoEditingEditingConsistenze_page.FrecetaDestraAccedi.click();
        Thread.sleep(sleep);
    }
    @Then("L utente  seleziona laWBS TE-ER-{int} {int}-Reattore {int} kV SE Roma Est e clicca  la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        suConfiguratoEditingEditingConsistenze_page.conistenza.click();
        Thread.sleep(sleep);
        suConfiguratoEditingEditingConsistenze_page.clickLineaInCavo.click();
        Thread.sleep(sleep);
    }
    @Then("l utente clicca su Creazione  Cantiere")
    public void l_utente_clicca_su_creazione_cantiere() throws InterruptedException {
      suConfiguratoEditingEditingConsistenze_page.clickModifica.click();
        Thread.sleep(sleep);
        suConfiguratoEditingEditingConsistenze_page.clickSalva.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }

}
