package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class SUNonConfigurato_Page {
 public    SUNonConfigurato_Page (){
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

    @FindBy(xpath = "//span[normalize-space()='TE-FR-21-031-Reattore 380 kV SE S.M. Capua Vetere']")
   public WebElement TEFR_CapuaVetere;

   @FindBy(xpath = "/html/body/app-root/main/app-wbs/div/div[2]/div/div[3]/button")
   public WebElement FrecetaDestraAccedi;

}
