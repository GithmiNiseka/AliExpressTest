package page_object_model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AliexpressHomeCompliancepage extends BasePage {

    // XPath for the "More" dropdown and the link inside it
    private final String moreDropdownXpath = "//span[@class='pc2023-header-tab--moreText--o8dQidV']";
    private final String linkXpath = "//a[@href='https://www.aliexpress.com/p/calp-plus/index.html?spm=a2g0o.best.testStatic.7.33412c25yiqy2B&osf=category_navigate_newTab2&queryFrom=kingKong&categoryTab=home_appliances&_gl=1*1o9qc48*_gcl_aw*R0NMLjE3MzA5MDk5NDAuRUFJYUlRb2JDaE1JM3RDNV9ZM0lpUU1WYjZSbUFoMHROeks3RUFBWUFTQUFFZ0pQNnZEX0J3RQ..*_gcl_au*MTU0NDY2NzM1Ni4xNzMwOTA5OTM5*_ga*Nzk0NjY1OTM3LjE3MzA5MDk5NDA.*_ga_VED1YSGNC7*MTczMDkxNDIyMi4yLjEuMTczMDkxNDM2Ny4yNi4wLjA.']";

    public AliexpressHomeCompliancepage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Method to click on the "More" dropdown and select the link that redirects to HomeCompliancePage
    public HomeCompliancePage clickOnMoreDropdownAndSelectLink() {
        // Click on the "More" dropdown
        WebElement moreDropdown = driver.findElement(By.xpath(moreDropdownXpath));
        moreDropdown.click();

        // Click on the link that redirects to HomeCompliancePage
        WebElement link = driver.findElement(By.xpath(linkXpath));
        link.click();

        // Wait for the URL to contain the specific part for the HomeCompliancePage
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("calp-plus/index.html"));

        // Return the HomeCompliancePage object
        return PageFactory.initElements(driver, HomeCompliancePage.class);
    }
}
