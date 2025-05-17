package Runners;


import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_TC704_.feature"},   //buraya feature files ın path i verilecek.
        glue = {"StepDefinitions"},    // Step definitions ın klasörü adı yazılıyor.
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("BrowserTipi")
    public void beforeClass(String browserName)
    {
        GWD.threadBrowserName.set(browserName);
    }

    @AfterClass
    public  static void writeExtendReport()
    {
        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "Serkan SEWOESTER");
        ExtentService.getInstance().setSystemInfo("Application Name", "Magento");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");

    }
    //Bu class tiplerine Runner Class lar denir.
}

// features pathlerinin alınması : ilgili feature dosyasının üzerinde
// sağ tuş -> copypath/refenrence seçildikten sonra çıkan seçeneklerden
// "content root" seçeneği ile uygun path alınmış olur.