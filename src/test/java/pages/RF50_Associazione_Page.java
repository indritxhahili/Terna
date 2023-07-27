package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class RF50_Associazione_Page {
    public RF50_Associazione_Page(){
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

    @FindBy(xpath = "//*[@id=\"org\"]/div/div[2]")
    public WebElement SelezionaUnorganizzazione;

    @FindBy(xpath = "(//span[normalize-space()='SSD-RIT-REI-ARI Cagliari'])[1]")
    public WebElement ClickCagliari;

    @FindBy(xpath = "//*[@id=\"wbs\"]/div/div[2]")
    public WebElement SecondCLick;

    @FindBy(xpath = "(//span[normalize-space()='TE-ER-21-012-Reattore 380 kV SE Roma Est'])[1]")
    public WebElement CLickReattore380kv;

    @FindBy(xpath = "/html/body/app-root/main/app-wbs/div/div[2]/div/div[3]/button")
    public WebElement FrecetaDestraAccedi;

    @FindBy(xpath = "/html/body/app-root/main/app-dashboard/div[3]/div[3]/div/div/div/div[3]/div/button[2]")
    public WebElement ClickConsistenzeCantiere;

    @FindBy(xpath = "//*[@id=\"cantiere\"]/div/div[2]")
    public WebElement ClickDropdwonCantiere;

    @FindBy(xpath = "//span[normalize-space()='TE-ER-21-012_CN_1']")
    public WebElement clickFirstCntiere;

    @FindBy(xpath = "/html/body/app-root/main/cantiere/div/div[3]/app-associa-consistenze-cantiere/mat-tab-group/div/mat-tab-body[1]/div/div/linee-aeree-sostegni/div/div[2]/div/button/span")
    public WebElement CLickCarattereSpeciale;
}
