package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ClickOK_Page;
import pages.SUNonConfigurato_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class SUNonConfigurato_stepDefinitions {
    SUNonConfigurato_Page suNonConfigurato_page = new SUNonConfigurato_Page();
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    @Given("L utente  inserisce  usernamext {int}  password  M1k1am0?glce clicca sul bottone  Log In")
    public void l_utente_inserisce_usernamext_password_m1k1am0_glce_clicca_sul_bottone_log_in(Integer int1) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        suNonConfigurato_page.CLickUsername.sendKeys("xt3533");
        Thread.sleep(sleep);
        suNonConfigurato_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L utente  clicca   sul pannello Project  Configurator")
    public void l_utente_clicca_sul_pannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        suNonConfigurato_page.ClickLogin.click();
        if(!suNonConfigurato_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            Thread.sleep(sleep);
            suNonConfigurato_page.prijectConfigClick.click();
        }
    }
    @Then("L utente  selezionaorganizzazio ne SSD-RIT-REI-ARI  Cagliari")
    public void l_utente_selezionaorganizzazio_ne_ssd_rit_rei_ari_cagliari() throws InterruptedException {
        if (!suNonConfigurato_page.SelezionaUnorganizzazione.isEnabled()){
            System.out.println("Step two failed");
        }else
            System.out.println("Step two passed");
        suNonConfigurato_page.SelezionaUnorganizzazione.click();
        Thread.sleep(sleep);
        suNonConfigurato_page.ClickCagliari.click();
        Thread.sleep(sleep);
        suNonConfigurato_page.SecondCLick.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente prova a selezionare il cantiere TE-FR-{int}-0C170L178re {int} kV SE SM Capua Vetere")
    public void l_utente_prova_a_selezionare_il_cantiere_te_fr_0c170l178re_k_v_se_sm_capua_vetere(Integer int1, Integer int2) throws InterruptedException {
    suNonConfigurato_page.TEFR_CapuaVetere.click();
        Thread.sleep(sleep);
        suNonConfigurato_page.FrecetaDestraAccedi.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }

}
