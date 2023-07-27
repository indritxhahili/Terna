package step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Test;
import pages.CCANonVisibilitaModulProjectConfigurator_Page;
import pages.ClickOK_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class CCANonVisibilitaModulProjectConfigurator_stepDefinition {
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    ClickOK_Page clickOK_page = new ClickOK_Page();
    CCANonVisibilitaModulProjectConfigurator_Page ccaNonVisibilitaModulProjectConfigurator_page = new CCANonVisibilitaModulProjectConfigurator_Page();
   @Test
    @Given("L'utente inserisce username  xt4052 password Prova15@!e clicca sul bottone Log In")
    public void l_utente_inserisce_username_xt4052_password_prova15_e_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        ccaNonVisibilitaModulProjectConfigurator_page.CLickUsername.sendKeys("xt4052");
        Thread.sleep(sleep);
        ccaNonVisibilitaModulProjectConfigurator_page.ClickPassword.sendKeys("Prova15@!");
        Thread.sleep(sleep);
        ccaNonVisibilitaModulProjectConfigurator_page.ClickLogin.click();
        Driver.closeDriver();
    }
}
