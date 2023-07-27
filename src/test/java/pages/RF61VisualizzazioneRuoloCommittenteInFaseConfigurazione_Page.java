package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

import java.util.Queue;

public class RF61VisualizzazioneRuoloCommittenteInFaseConfigurazione_Page {
   public RF61VisualizzazioneRuoloCommittenteInFaseConfigurazione_Page(){
       PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement CLickUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement ClickPassword;

    @FindBy(xpath = "//input[@id='kc-login']")
    public WebElement ClickLogin;

    @FindBy(xpath = "/html/body/app-root/main/dashboard/section/div/div[1]/div[1]/div/div[1]/div/div/div/div")
    public WebElement prijectConfigClick;

    @FindBy(xpath = "//*[@id=\"org\"]/div/div[2]/div")
    public WebElement SelezionaUNorganizzazioneDropDown;

    @FindBy(xpath = "(//span[normalize-space()='SSD-RIT-REI-ARI Cagliari'])[1]")
    public WebElement SelezionaCagliari;

    @FindBy(xpath = "//*[@id=\"wbs\"]/div/div[2]/div")
    public WebElement SelezionaUNAWBS;

    @FindBy(xpath = "(//span[normalize-space()='TE-ER-21-012-Reattore 380 kV SE Roma Est'])[1]")
    public WebElement clickDropDownRomaEast;

    @FindBy(xpath = "/html/body/app-root/main/app-wbs/div/div[2]/div/div[3]/button")
    public WebElement clickFrecetaDestra;

    @FindBy(xpath = "/html/body/app-root/main/app-dashboard/div[3]/div[1]/div/div/div/div[3]/div/button[4]")
    public WebElement clickCreazioneCantiere;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[1]/div[2]/button")
    public WebElement clickAggiungi;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/thead/tr[2]/td[2]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input")
    public WebElement nomeaAutomatico;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/thead/tr[2]/td[3]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-default-editor/div/input-editor/input")
    public WebElement  Descrizione;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/thead/tr[2]/td[4]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-custom-editor/list-custom-edit/select")
    public WebElement tipologia;

    @FindBy(xpath = "(//option[@value='Misto'])[1]")
     public WebElement clickMisto;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/thead/tr[2]/td[6]/ng2-st-actions/a[1]")
    public WebElement clickSalva;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/tbody/tr[1]/td[5]/ng2-smart-table-cell/table-cell-view-mode/div/custom-view-component/cantiere-actions-buttons/div/button")
    public WebElement clickConfigura;

    @FindBy(xpath = "(//*[name()='svg'][@class='svg-inline--fa fa-users-hard-hat xs-icon text-primary'])[1]")
    public WebElement organigrammantiere;

    @FindBy(xpath = "//nav[@id='main-navbar']")
    public WebElement clickRuoli;
}
