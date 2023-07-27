package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class RF52CreazioneCantiereSelezionoLineeAeree_Page {
   public RF52CreazioneCantiereSelezionoLineeAeree_Page (){
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

    @FindBy(xpath = "(//button[normalize-space()='Creazione Cantiere'])[1]")
    public WebElement CreazioneCantiere;

    @FindBy(xpath = "(//button[@class='btn btn-primary m-1'])[1]")
    public WebElement aggiungi;

    @FindBy(xpath = "(//input[@placeholder='Nome'])[1]")
    public WebElement click_Nome_Cantiere;

    @FindBy(xpath = "(//input[@placeholder='Descrizione'])[1]")
    public WebElement clickDiscrizioneCntiere;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/thead/tr[2]/td[4]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-custom-editor/list-custom-edit/select")
    public WebElement clickTipologiaDropdownMenu;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/thead/tr[2]/td[4]/ng2-smart-table-cell/table-cell-edit-mode/div/table-cell-custom-editor/list-custom-edit/select/option[1]")
    public WebElement lineAereo;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/thead/tr[2]/td[6]/ng2-st-actions/a[1]/i")
    public WebElement salva_Click;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/ng2-smart-table-pager/nav/ul/li[5]/a")
    public WebElement click2Pagina;

    @FindBy(xpath = "/html/body/app-root/main/creazione-cantiere/div/div[3]/div[2]/ng2-smart-table/table/tbody/tr[1]/td[5]/ng2-smart-table-cell/table-cell-view-mode/div/custom-view-component/cantiere-actions-buttons/div/button")
    public WebElement clickConfigura;


}
