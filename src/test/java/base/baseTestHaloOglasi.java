package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.HostnameVerifier;

public class baseTestHaloOglasi {

    public static WebDriver driver;
    public static WebDriverWait wdwait;
    public static Actions hover;
    public static JavascriptExecutor js;



    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 30);
        hover = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://www.halooglasi.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;


    }

    @After
    public void tearDown() {
        driver.close();

    }


}
