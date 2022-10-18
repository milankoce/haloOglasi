package test;

import base.baseTestHaloOglasi;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

import java.util.Random;

public class haloOglasiTest extends baseTestHaloOglasi {

    haloOglasiPage HaloOglasiPage;
    haloOglasiRegistrationPage HaloOglasiRegistrationPage;
    haloOglasiSuccesfulRegistrationPage HaloOglasiSuccesfulRegistrationPage;
    mailinatorPage Mailinator;
    mailinatorSuccefulMessage MailinatorSuccesfulMesage;
    succesfulAccountActivation SuccesfulAccountActivation;

    Random random = new Random();
    int x = random.nextInt(99999);


    @Before
    public void setUpTest() {
        HaloOglasiPage = new haloOglasiPage();
        HaloOglasiRegistrationPage = new haloOglasiRegistrationPage();
        HaloOglasiSuccesfulRegistrationPage = new haloOglasiSuccesfulRegistrationPage();
        Mailinator = new mailinatorPage();
        MailinatorSuccesfulMesage = new mailinatorSuccefulMessage();
        SuccesfulAccountActivation = new succesfulAccountActivation();


    }

    @Test
    public void succefulRegistrationHloOglasi() {
        HaloOglasiPage.ureduButton();
        HaloOglasiPage.registracijaButton();
        HaloOglasiRegistrationPage.setUserNameField("kolkan" + x);
        HaloOglasiRegistrationPage.setEmailField("koklan" + x + "@mailinator.com");
        HaloOglasiRegistrationPage.setPasswordField("12345678");
        HaloOglasiRegistrationPage.setConfirmPasswordField("12345678");
        HaloOglasiRegistrationPage.setRegistrujMeButton();
        Assert.assertTrue(HaloOglasiSuccesfulRegistrationPage.succesfulRegistrationMessageDisplayed());
        Assert.assertEquals("Registracija je uspela!\n" +
                        "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : koklan" + x + "@mailinator.com !",
                HaloOglasiSuccesfulRegistrationPage.succesfulRegistrationMessageText());
        driver.get("https://www.mailinator.com/");
        Mailinator.setEmailInputField("koklan" + x);
        Mailinator.setGoToEmailButton();
        Mailinator.setEmailClick();

        MailinatorSuccesfulMesage.switcToIframeAndClickOnAktivirajNalogLink();
        SuccesfulAccountActivation.moveToNewTab();


        Assert.assertTrue(SuccesfulAccountActivation.succesfulAccountActivationMessageDisplayed());
        Assert.assertEquals("Vaš nalog je uspešno aktiviran!\n" +
                "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava",
                SuccesfulAccountActivation.succesfulAccountMessageText());



































    }






}
