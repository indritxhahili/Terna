package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class RF56OrganigrammaCantiereInserimentoLucchetto_4_stepCreazione_Page {
    public RF56OrganigrammaCantiereInserimentoLucchetto_4_stepCreazione_Page(){
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

    @FindBy(xpath = "/html/body/app-root/main/app-dashboard/div[3]/div[3]/div/div/div/div[3]/div/button[1]")
    public WebElement OrganigrammaDiCantiere;

    @FindBy(xpath = "//*[@id=\"cantiere\"]/div/div[2]")
    public WebElement qualsiasiDropDown;

    @FindBy(xpath = "//span[normalize-space()='TE-ER-21-012_CN_9']")
    public WebElement clickSecondDropDown;

    @FindBy(xpath = "//*[@id=\"cdk-step-label-0-3\"]")
    public WebElement luogo;
}
