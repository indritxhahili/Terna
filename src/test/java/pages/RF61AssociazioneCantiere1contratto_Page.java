package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class RF61AssociazioneCantiere1contratto_Page {
  public   RF61AssociazioneCantiere1contratto_Page(){
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

   @FindBy(xpath = "/html/body/app-root/main/app-dashboard/div[3]/div[3]/div/div/div/div[3]/div/button[3]")
  public WebElement ContratiAppaltatori;

   @FindBy(xpath = "/html/body/app-root/main/cantiere/div/div[2]/div/div[3]/mat-select/div/div[2]")
  public WebElement clickDropDown;

   @FindBy(xpath = "(//span[normalize-space()='TE-ER-21-012_CN_36'])[1]")
  public WebElement click_CN36;

   @FindBy(xpath = "/html/body/app-root/main/cantiere/div/div[3]/conf-cantiere/mat-stepper/div/div[2]/div[1]/contratti-appaltatori/div/div/button/i")
  public WebElement OpenChiave;

   @FindBy(xpath = "/html/body/app-root/main/cantiere/div/div[3]/conf-cantiere/mat-stepper/div/div[2]/div[1]/contratti-appaltatori/div/ng2-smart-table[1]/table/tbody/tr[1]/td[1]/input")
  public WebElement clickPrimoCheckBox;

   @FindBy(xpath = "/html/body/app-root/main/cantiere/div/div[3]/conf-cantiere/mat-stepper/div/div[2]/div[1]/div/button")
  public WebElement Salva;

}
