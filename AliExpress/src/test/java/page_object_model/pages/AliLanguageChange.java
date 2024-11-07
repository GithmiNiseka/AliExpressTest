package page_object_model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AliLanguageChange {
    private WebDriver driver;
    private WebDriverWait wait;

    public AliLanguageChange(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Increase wait time if necessary
        PageFactory.initElements(driver, this);
    }

    // Locators
    private By countryDropdown = By.xpath("//span[@class='ship-to--cssFlag--3qFf5C9 country-flag-y2023 LK']");
    private By koreaOption = By.xpath("//span[text()='Korea']");
    private By saveButton = By.xpath("//div[text()='Save']");

    // Open the country dropdown
    public void openCountryDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdown)).click();
    }

    // Select the country dynamically based on the country name
    public void selectCountry(String country) {
        By countryLocator = By.xpath("//span[text()='" + country + "']");
        wait.until(ExpectedConditions.elementToBeClickable(countryLocator)).click();
        // Add a short wait to allow the page to update if it is dynamic
        try {
            Thread.sleep(2000); // Wait for page to process the country selection
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Save the selected country
    public void saveCountrySelection() {
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }
}
