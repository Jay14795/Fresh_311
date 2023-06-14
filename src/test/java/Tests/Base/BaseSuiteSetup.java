package Tests.Base;

import Pages.Login.LoginPage;
import data.LoginData;
import io.github.jaygandhi.enums.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static io.github.jaygandhi.drivers.DriverManager.*;

public class BaseSuiteSetup
{


    @Parameters ("browser")
    @BeforeClass (alwaysRun = true)
    public void setupTest (@Optional String browser) throws InterruptedException {
        if (browser == null) {
            browser = "chrome";
        }
        createDriver (Browsers.valueOf (browser.toUpperCase ()));

        getDriver().get("http://311-cms.silicontechnolabs.com/");
        Thread.sleep(6000);

        LoginPage loginPage= new LoginPage();
        loginPage.email();
        Thread.sleep(2000);
        loginPage.password();
        Thread.sleep(2000);
        loginPage.LoginClick();
        Thread.sleep(5000);
        loginPage.selectCity();
        Thread.sleep(3000);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        quitDriver();
    }
}
