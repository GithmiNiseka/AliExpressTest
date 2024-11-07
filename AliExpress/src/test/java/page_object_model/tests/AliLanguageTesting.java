package page_object_model.tests;

import org.testng.annotations.Test;
import page_object_model.pages.AliLanguageChange;
import page_object_model.utilities.Utilities;

public class AliLanguageTesting extends Utilities {

    @Test
    public void changeCountryToKorea() {
        // Navigate to the AliExpress homepage
        browserFactory.getDriver().get("https://best.aliexpress.com/");

        // Initialize the AliLanguageChange page
        AliLanguageChange homePage = new AliLanguageChange(browserFactory.getDriver());

        // Open the country dropdown
        homePage.openCountryDropdown();

        // Select the country "Korea"
        homePage.selectCountry("Korea");

        // Save the selected country
        homePage.saveCountrySelection();

        // Add a wait here to verify the page update after saving the country
        try {
            Thread.sleep(3000); // Wait for the page to reflect changes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Optional: Verify if the country has changed in the UI
        // This can be done by checking the country flag or a UI element that reflects the country change.
    }
}
