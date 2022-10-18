package page;

import base.baseTestHaloOglasi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorSuccefulMessage extends baseTestHaloOglasi {
    public mailinatorSuccefulMessage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "html_msg_body")
    WebElement iFrameBody;

    @FindBy(xpath = "//strong[contains(text(), \"Aktiviraj nalog\")]")
    WebElement aktivirajNalogLink;

    public void switcToIframeAndClickOnAktivirajNalogLink() {
        driver.switchTo().frame(iFrameBody);
        wdwait.until(ExpectedConditions.visibilityOf(aktivirajNalogLink));
        aktivirajNalogLink.click();
        driver.switchTo().defaultContent();


    }



}
