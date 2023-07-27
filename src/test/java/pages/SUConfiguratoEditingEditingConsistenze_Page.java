package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class SUConfiguratoEditingEditingConsistenze_Page {
    public SUConfiguratoEditingEditingConsistenze_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    @FindBy(xpath = "/html/body/app-root/main/app-dashboard/div[3]/div[1]/div/div/div/div[3]/div/button[3]")
    public WebElement conistenza;

    @FindBy(xpath = "//*[@id=\"mat-tab-label-0-1\"]")
    public WebElement clickLineaInCavo;

    @FindBy(xpath = "/html/body/app-root/main/conf-fisica-cantiere/div/div[3]/mat-tab-group/div/mat-tab-body[2]/div/div/linee-cavo-terminali/ng2-smart-table/table/tbody/tr[1]/td[5]/ng2-smart-table-cell/table-cell-view-mode/div/custom-view-component/actions-buttons/div/a[1]")
    public WebElement clickModifica;

    @FindBy(xpath = "//span[normalize-space()='Salva']")
    public WebElement clickSalva;

}