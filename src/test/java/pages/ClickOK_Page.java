package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitiess.Driver;

public class ClickOK_Page {
    public ClickOK_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "/html/body/app-root/app-banner-informativa/div/div/div/div[2]/button")
    public WebElement clickOk;
}
