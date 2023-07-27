package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class CCANonVisibilitaModulProjectConfigurator2_Page {
     public CCANonVisibilitaModulProjectConfigurator2_Page (){
         PageFactory.initElements(Driver.getDriver(),this);
     }
    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement CLickUsername;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement ClickPassword;
    @FindBy(xpath = "//input[@id='kc-login']")
    public WebElement ClickLogin;
}
