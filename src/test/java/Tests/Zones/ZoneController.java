package Tests.Zones;

import Pages.Zones.zonesPage;
import Tests.Base.BaseSuiteSetup;
import org.testng.annotations.Test;
import static io.github.jaygandhi.drivers.DriverManager.getDriver;

public class ZoneController extends BaseSuiteSetup
{

    @Test
    public void add_zone() throws InterruptedException {
        getDriver().navigate().to("http://311-cms.silicontechnolabs.com/zonecontroller");
        Thread.sleep(6000);
        zonesPage ZonesPage= new zonesPage();
        ZonesPage.CreateZone();
        ZonesPage.addZone();
    }


}
