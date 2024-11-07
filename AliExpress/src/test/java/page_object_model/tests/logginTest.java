package page_object_model.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page_object_model.utilities.Utilities;

import java.time.Duration;

public class logginTest extends Utilities {
    WebDriver driver;

    @Test
    void loginTest() {
        driver = browserFactory.getDriver();
        driver.get("https://best.aliexpress.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Click on the 'Sign in' button to open the login pop-up
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Sign in']")));
        signInButton.click();

        // Wait for the email input field to be visible in the pop-up
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class, 'cosmos-input')]")));
        emailInput.sendKeys("githmidesilva22@gmail.com");

        // Wait for the password input field and enter the password
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fm-login-password")));
        passwordInput.sendKeys("Gee@9922");

        // Click the login button in the pop-up
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'cosmos-btn-primary')]")));
        loginButton.click();
    }
}
