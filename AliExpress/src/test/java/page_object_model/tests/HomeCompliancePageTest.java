package page_object_model.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import page_object_model.pages.AliexpressHomeCompliancepage;
import page_object_model.pages.HomeCompliancePage;
import page_object_model.utilities.Utilities;

public class HomeCompliancePageTest extends Utilities {

    // Setup WebDriver instance
    WebDriver driver;

    @Test
    public void testDropdownLinkNavigation() {
        // Initialize WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Instantiate the AliexpressHomeCompliancepage object
        AliexpressHomeCompliancepage homeCompliancePage = new AliexpressHomeCompliancepage(driver);

        // Load the initial page (AliExpress homepage)
        homeCompliancePage.loadUrl("https://www.aliexpress.com");

        // Click on the "More" dropdown and select the link that leads to HomeCompliancePage
        HomeCompliancePage compliancePage = homeCompliancePage.clickOnMoreDropdownAndSelectLink();

        // Scroll down on the HomeCompliancePage to simulate user interaction (optional step)
        compliancePage.scrollPage(0, 200);

        // Close the browser (optional, clean-up)
        driver.quit();
    }
}
