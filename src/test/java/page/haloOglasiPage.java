package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloOglasiPage extends baseTestHaloOglasi {
    public haloOglasiPage() { PageFactory.initElements(driver, this); }


    @FindBy(css = ".cookie-policy-btn")
    WebElement ureduButton;
    @FindBy (css = ".header-category-link.login-btn-wrapper")
    WebElement ulogujSeButton;
    @FindBy(xpath = "//a[contains(@title,'Registrujte se')]")
    WebElement registracijaButton;

    public void ureduButton() {
        wdwait.until(ExpectedConditions.visibilityOf(ureduButton));
        ureduButton.click();
    }

    public void registracijaButton() {
        wdwait.until(ExpectedConditions.visibilityOf(registracijaButton));
        registracijaButton.click();
    }

    public void setUlogujSeButton() {
        wdwait.until(ExpectedConditions.visibilityOf(ulogujSeButton));
        ulogujSeButton.click();
    }







}
