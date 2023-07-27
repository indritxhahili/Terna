package step_definitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class https {
    public static void main(String[] args) throws InterruptedException {
        DesiredCapabilities desiredCapabilities= DesiredCapabilities.chrome();
        desiredCapabilities.acceptInsecureCerts();
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(desiredCapabilities);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");

       String AcctualTitle = "Practice";
       String expectedTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle,AcctualTitle);

        System.out.println(AcctualTitle);
        System.out.println(expectedTitle);
    }
}
