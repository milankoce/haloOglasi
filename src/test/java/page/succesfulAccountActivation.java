package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class succesfulAccountActivation extends baseTestHaloOglasi {
    public succesfulAccountActivation () {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".regsitration-success")
    WebElement succesfulAccountActivationMessage;

    public boolean succesfulAccountActivationMessageDisplayed () {
        wdwait.until(ExpectedConditions.visibilityOf(succesfulAccountActivationMessage));
        return succesfulAccountActivationMessage.isDisplayed();
    }

    public String succesfulAccountMessageText() {
        wdwait.until(ExpectedConditions.visibilityOf(succesfulAccountActivationMessage));
        return succesfulAccountActivationMessage.getText();

    }

    public void moveToNewTab() {
        wdwait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
