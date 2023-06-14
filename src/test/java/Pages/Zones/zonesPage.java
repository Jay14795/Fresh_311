package Pages.Zones;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.github.jaygandhi.drivers.DriverManager.getDriver;

public class zonesPage
{
    public void CreateZone() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[normalize-space()='Create']")).click();
        Thread.sleep(2000);
    }

    public void addZone() throws InterruptedException {
        getDriver().findElement(By.id("parent_id")).sendKeys("QA_Zone", Keys.ENTER);
        Thread.sleep(2000);
        getDriver().findElement(By.id("name")).sendKeys("QA_Zone 2");
        Thread.sleep(2000);
        getDriver().findElement(By.id("code")).sendKeys("2200");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//div[@class='ant-form-item backColorPicker']//div[@class='ant-form-item-control-input-content']//div")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.id("rc-editable-input-1")).sendKeys("#8141AB");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//button[@class='ant-btn ant-btn-primary secondarySmallBtn mb-15']")).click();
        Thread.sleep(2000);
        WebElement geoArea = getDriver().findElement(By.id("location"));
        geoArea.click();
        Thread.sleep(2000);
        geoArea.sendKeys("MANINAGAR",Keys.ENTER);
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//button[@class='ant-btn ant-btn-primary submitBtn']")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.id("zoom_level")).sendKeys("16");
        Thread.sleep(2000);
        getDriver().findElement(By.id("agency_ref_id")).sendKeys("0203");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//input[@value='1']")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

    }

}
