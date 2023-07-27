package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.ClickOK_Page;
import pages.RF50AssociazioneConsistenzeLineeIncavo_page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class RF50AssociazioneConsistenzeLineeIncavo_stepDefinitions {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
      RF50AssociazioneConsistenzeLineeIncavo_page rf50AssociazioneConsistenzeLineeIncavo_page = new RF50AssociazioneConsistenzeLineeIncavo_page();
    @Given("L'utente inserisce:username: xt3533password: M1k1am0?glc e clicca sul bottone Log In")
    public void l_utente_inserisce_username_xt3533password_m1k1am0_glc_e_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        rf50AssociazioneConsistenzeLineeIncavo_page.CLickUsername.sendKeys("xt3533");
        Thread.sleep(sleep);
        rf50AssociazioneConsistenzeLineeIncavo_page.ClickPassword.sendKeys("M1k1am0?glc");
    }
    @Then("L'utente  clicca sul pannello Project Configurator")
    public void l_utente_clicca_sul_pannello_project_configurator() throws InterruptedException {
        Thread.sleep(sleep);
        rf50AssociazioneConsistenzeLineeIncavo_page.ClickLogin.click();
        if(!rf50AssociazioneConsistenzeLineeIncavo_page.prijectConfigClick.isEnabled()){
            System.out.println("Step one failed");
        }else {
            System.out.println("Step one passed");
            Thread.sleep(sleep);
            rf50AssociazioneConsistenzeLineeIncavo_page.prijectConfigClick.click();
        }
    }
    @Then("L'utente seleziona l'organizzazione:SSD-RIT-REI-ARI Cagliari")
    public void l_utente_seleziona_l_organizzazione_ssd_rit_rei_ari_cagliari() throws InterruptedException {
     rf50AssociazioneConsistenzeLineeIncavo_page.SelezionaUNorganizzazioneDropDown.click();
        Thread.sleep(sleep);
    }
    @Then("L'utente seleziona la WBS: TE-ER-{int}-{int}-Reattore {int} kV SE Roma Est e clicca la freccia a destra")
    public void l_utente_seleziona_la_wbs_te_er_reattore_k_v_se_roma_est_e_clicca_la_freccia_a_destra(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        if(!rf50AssociazioneConsistenzeLineeIncavo_page.SelezionaCagliari.isEnabled()){
            System.out.println("Step three failed");
        }else {
            System.out.println("Step three passed");
            Thread.sleep(sleep);
            rf50AssociazioneConsistenzeLineeIncavo_page.SelezionaCagliari.click();
        }
    }
    @When("L'utente clicca sulla voce Consistenze  Cantiere")
    public void l_utente_clicca_sulla_voce_consistenze_cantiere() throws InterruptedException {
        if(!rf50AssociazioneConsistenzeLineeIncavo_page.SelezionaUNAWBS.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            Thread.sleep(sleep);
            rf50AssociazioneConsistenzeLineeIncavo_page.SelezionaUNAWBS.click();
        }
    }
    @When("L'utente seleziona il cantiere:TE-ER-{int}-{int}_CN_{int}")
    public void l_utente_seleziona_il_cantiere_te_er__cn(Integer int1, Integer int2, Integer int3) throws InterruptedException {
        if(!rf50AssociazioneConsistenzeLineeIncavo_page.clickDropDownRomaEast.isEnabled()){
            System.out.println("Step 4 failed");
        }else {
            System.out.println("Step 4 passed");
            Thread.sleep(sleep);
            rf50AssociazioneConsistenzeLineeIncavo_page.clickDropDownRomaEast.click();
        }
    }
    @Then("L'utente seleziona il tab {string}")
    public void l_utente_seleziona_il_tab(String string) throws InterruptedException {
        if(!rf50AssociazioneConsistenzeLineeIncavo_page.cliccaSullaVoceConsistenzeCantiere.isEnabled()){
            System.out.println("Step 5 failed");
        }else {
            System.out.println("Step 5 passed");
            Thread.sleep(sleep);
            rf50AssociazioneConsistenzeLineeIncavo_page.cliccaSullaVoceConsistenzeCantiere.click();
        }
        Thread.sleep(sleep);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,400)","");
        Thread.sleep(sleep);
        if(!rf50AssociazioneConsistenzeLineeIncavo_page.clickConsistenzeCantiere.isEnabled()){
            System.out.println("Step 6 failed");
        }else {
            System.out.println("Step 6 passed");
            Thread.sleep(sleep);
            rf50AssociazioneConsistenzeLineeIncavo_page.clickConsistenzeCantiere.click();
        }
    }
    @Then("L'utente seleziona l'icona di associamento relativa al sostegno {string}")
    public void l_utente_seleziona_l_icona_di_associamento_relativa_al_sostegno(String string) throws InterruptedException {
        if(!rf50AssociazioneConsistenzeLineeIncavo_page.dropdwonCantiere.isEnabled()){
            System.out.println("Step 6 failed");
        }else {
            System.out.println("Step 6 passed");
            Thread.sleep(sleep);
            rf50AssociazioneConsistenzeLineeIncavo_page.dropdwonCantiere.click();
        }
        Thread.sleep(sleep);
        rf50AssociazioneConsistenzeLineeIncavo_page.CN_14click.click();
        Thread.sleep(sleep);
        Driver.closeDriver();
    }
}
