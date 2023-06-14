package Pages.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static io.github.jaygandhi.drivers.DriverManager.getDriver;

public class LoginPage
{
    public void email()
    {
      //  getDriver ().findElement (By.id ("email")).sendKeys(TestDataBuilder.getLoginData().getEmail());
        getDriver ().findElement (By.id ("email")).sendKeys("superadmin@everythingcivic.com");
    }

    public void password()
    {
        // getDriver ().findElement (By.id ("password")).sendKeys(TestDataBuilder.getLoginData().getPassword());
        getDriver ().findElement (By.id ("password")).sendKeys("2022@2N39s/v@2.#q");

    }

    public void LoginClick()
    {
        getDriver ().findElement (By.xpath ("//span[normalize-space()='Login']")).click();

    }
    public void selectCity()
    {
        getDriver().findElement(By.id("app_list")).sendKeys("MCD", Keys.ENTER);
    }
}
