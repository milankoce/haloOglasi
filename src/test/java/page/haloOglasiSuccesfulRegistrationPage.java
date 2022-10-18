package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiSuccesfulRegistrationPage extends baseTestHaloOglasi {
    public haloOglasiSuccesfulRegistrationPage () { PageFactory.initElements(driver, this); }

    @FindBy(css = ".regsitration-success")
    WebElement succesfulRegistrationMessage;

    public boolean succesfulRegistrationMessageDisplayed() {
        wdwait.until(ExpectedConditions.visibilityOf(succesfulRegistrationMessage));
        return  succesfulRegistrationMessage.isDisplayed();
    }

    public String succesfulRegistrationMessageText() {
        wdwait.until(ExpectedConditions.visibilityOf(succesfulRegistrationMessage));
        return succesfulRegistrationMessage.getText();
    }


}
