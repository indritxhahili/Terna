package step_definitions;

import io.cucumber.java.en.Given;
import pages.CCANonVisibilitaModulProjectConfigurator2_Page;
import pages.ClickOK_Page;
import utilitiess.ConfigurationReader;
import utilitiess.Driver;

public class CCANonVisibilitaModulProjectConfigurator2_stepDefinition {
    ClickOK_Page clickOK_page = new ClickOK_Page();
    CCANonVisibilitaModulProjectConfigurator2_Page ccaNonVisibilitaModulProjectConfigurator2_page = new CCANonVisibilitaModulProjectConfigurator2_Page();
    int sleep =  (ConfigurationReader.getPropertyInt("Time_Sleep"));
    @Given("L'utente inserisce  username  xt4052 password Prova15@!e clicca sul bottone Log In")
    public void l_utente_inserisce_username_xt4052_password_prova15_e_clicca_sul_bottone_log_in() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("Terna"));
        Thread.sleep(sleep);
        clickOK_page.clickOk.click();
        Thread.sleep(sleep);
        ccaNonVisibilitaModulProjectConfigurator2_page.CLickUsername.sendKeys("xt4052");
        Thread.sleep(sleep);
        ccaNonVisibilitaModulProjectConfigurator2_page.ClickPassword.sendKeys("Prova15@!");
        Thread.sleep(sleep);
        ccaNonVisibilitaModulProjectConfigurator2_page.ClickLogin.click();
        Driver.closeDriver();
    }
}
