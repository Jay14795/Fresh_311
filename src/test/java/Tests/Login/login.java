package Tests.Login;

import Pages.Login.LoginPage;
import Tests.Base.BaseSuiteSetup;
import org.testng.annotations.Test;


public class login extends BaseSuiteSetup
{
    @Test
    public void Login() throws InterruptedException {

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
}
