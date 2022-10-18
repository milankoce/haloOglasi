package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiRegistrationPage extends baseTestHaloOglasi {
    public haloOglasiRegistrationPage() { PageFactory.initElements(driver,this); }


    @FindBy(id = "UserName")
    WebElement userNameField;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(css = ".button-reg.save.save-entity.person-face.btn-main")
    WebElement registrujMeButton;
    @FindBy(id = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement saglasnostButton;


    public void setUserNameField(String name) {
        wdwait.until(ExpectedConditions.visibilityOf(userNameField));
        userNameField.clear();
        userNameField.sendKeys(name);
    }

    public void setEmailField(String email) {
        wdwait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.clear();
        emailField.sendKeys(email);

    }

    public void setPasswordField(String password) {
        wdwait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void setConfirmPasswordField(String confirmPassword) {
        wdwait.until(ExpectedConditions.visibilityOf(confirmPasswordField));
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void setRegistrujMeButton() {
        wdwait.until(ExpectedConditions.visibilityOf(registrujMeButton));
        registrujMeButton.click();
    }

    public void setSaglasnostButton() {
        wdwait.until(ExpectedConditions.visibilityOf(saglasnostButton));
        saglasnostButton.click();
    }


}
