package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class RF51LineeAereeCampate_Page {
    public RF51LineeAereeCampate_Page(){
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

    @FindBy(xpath = "/html/body/app-root/main/app-dashboard/div[3]/div[1]/div/div/div/div[3]/div/button[3]")
    public WebElement clickConsistenza;

    @FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]/div/div/linee-aeree-sostegni/div/div[2]/div[1]/button[2]")
    public WebElement agguingiClick;
    @FindBy(xpath = "//input[@formcontrolname='picchetto']")
    public WebElement codicePicchetto;

    @FindBy(xpath = "//*[@id=\"mat-select-value-9\"]")
    public WebElement DropdownRegione;

    @FindBy(xpath = "//span[normalize-space()='Lazio']")
    public WebElement clickLzioDropdwon;

    @FindBy(xpath = "(//div[@id='mat-select-value-11'])[1]")
    public WebElement comuneDropdown;

    @FindBy(xpath = "//span[normalize-space()='Fabrica di Roma']")
    public WebElement CommuneRoma;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[2]/div[1]/mat-select/div/div[2]")
    public WebElement serieDropdwon;

    @FindBy(xpath = "(//span[normalize-space()='380_ST_31_5T'])[1]")
    public WebElement CLickNorm;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[2]/div[2]/mat-select/div/div[2]")
    public WebElement marca;

    @FindBy(xpath = "(//span[normalize-space()='AC'])[1]")
    public WebElement clickDentroMarca;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[2]/div[3]/mat-select/div/div[2]")
    public WebElement ClickAltezza;

    @FindBy(xpath = "(//span[normalize-space()='9'])[1]")
    public WebElement click5NellaAltezza;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[2]/div[4]/mat-select/div/div[2]")
    public WebElement tipologia;

    @FindBy(xpath = "(//span[normalize-space()='Amarro'])[1]")
    public WebElement AmaroTipologia;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[4]/div[1]/input")
    public WebElement latitudineCLick;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mdb-modal-container[1]/div[1]/div[1]/modal-linea-sostegno[1]/div[2]/form[1]/div[1]/div[4]/div[2]/input[1]")
    public WebElement Longitudine;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[4]/div[3]/mat-select/div/div[2]")
    public WebElement liveloDiTensione;

    @FindBy(xpath = "(//span[normalize-space()='380 kV'])[1]")
    public WebElement click380KW;

    @FindBy(xpath = "(//span[normalize-space()='Salva'])[1]")
    public WebElement SalvaClick;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[1]/div[2]/mat-select/div/div[2]")
    public WebElement clickRegione;

    @FindBy(xpath = "(//span[normalize-space()='Lazio'])[1]")
    public WebElement clickLazio;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[1]/div[3]/div/mat-select/div/div[2]")
    public WebElement comuneautomatico3;

    @FindBy(xpath = "(//span[normalize-space()='Fabrica di Roma'])[1]")
    public WebElement clickRomaAutomatico3;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[2]/div[1]/mat-select/div/div[2]")
    public WebElement clickserieAutomatico3;

    @FindBy(xpath = "(//span[normalize-space()='380_ST_31_5T'])[1]")
    public WebElement clickNormAutomatico3;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[2]/div[2]/mat-select/div/div[2]")
    public WebElement marca2;

    @FindBy(xpath = "(//span[normalize-space()='AC'])[1]")
    public WebElement clickDentroMarca2;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[2]/div[3]/mat-select/div/div[2]")
    public WebElement clickAltezzaAutomatico3;

    @FindBy(xpath = "(//span[normalize-space()='9'])[1]")
    public WebElement click10Automatico3;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[2]/div[4]/mat-select/div/div[2]")
    public WebElement clickTipologiaAutomatico3;

    @FindBy(xpath = "(//span[normalize-space()='Amarro'])[1]")
    public WebElement clickAmaroAutomatico3;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[4]/div[1]/input")
    public WebElement clickLatitudineAutomatico3;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[4]/div[3]/mat-select/div/div[2]")
    public WebElement liveloTensione;

    @FindBy(xpath = "(//span[normalize-space()='380 kV'])[1]")
    public WebElement click380LIveloTensione;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-sostegno/div[2]/form/div/div[4]/div[2]/input")
    public WebElement clickLongitudineAutomatico3;

    @FindBy(xpath = "//*[@id=\"mat-tab-content-0-0\"]/div/div/linee-aeree-campate/div[1]/div[2]/div/button[2]")
    public WebElement aggiungiCampate;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[1]/div[1]/mat-select/div/div[2]")
    public WebElement codiceSostegno;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[11]/span")
    public WebElement clickAutomatico2DaCodiceSostegno;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[1]/div[2]/mat-select/div/div[2]")
    public WebElement clickcodiceA_Automatico3;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[12]/span")
    public WebElement clickAutomatico3;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[2]/div[1]/input")
    public WebElement automaticompataDenominazione;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[2]/div[2]/div/input")
    public WebElement lunghezza;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[2]/div[3]/mat-select/div/div[2]")
    public WebElement liveloTensione2;

    @FindBy(xpath = "//span[normalize-space()='380 kV']")
    public WebElement getClick380Tensione;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[2]/div[4]/mat-select/div/div[2]")
    public WebElement clickTipoConduttori;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span")
    public WebElement clickPrimo;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[2]/div[5]/div[2]/input")
    public WebElement NumeroDiConduttori;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[2]/div[6]/mat-select/div/div[2]")
    public WebElement funeDiGuardia;

    @FindBy(xpath = "//span[normalize-space()='ACZC-10,5']")
    public WebElement clickPorimoFunoDiGuardia;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mdb-modal-container/div/div/modal-linea-campata/div[2]/form/div/div[2]/div[7]/mat-select/div/div[2]")
    public WebElement clickFuneDiGuardia2;

    @FindBy(xpath = "(//span[normalize-space()='ACZC-11,5'])[1]")
    public WebElement clickPRIMOFunieDiGuardia2;

    @FindBy(xpath = "//span[normalize-space()='Salva']")
    public WebElement clickSalva;
}
