package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorPage extends baseTestHaloOglasi {
    public mailinatorPage() { PageFactory.initElements(driver, this); }

    @FindBy(id = "search")
    WebElement emailInputField;
    @FindBy(xpath = "//button[contains(@value,'Search for public inbox for free')]")
    WebElement goToEmailButton;
    @FindBy(xpath = "(//td[@class=\"ng-binding\"])[1]")
    WebElement emailClick;

    public void setEmailInputField(String email) {
        wdwait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.clear();
        emailInputField.sendKeys(email);
    }

    public void setGoToEmailButton() {
        wdwait.until(ExpectedConditions.visibilityOf(goToEmailButton));
        goToEmailButton.click();
    }

    public void setEmailClick () {
        wdwait.until(ExpectedConditions.visibilityOf(emailClick));
        emailClick.click();
    }






}
