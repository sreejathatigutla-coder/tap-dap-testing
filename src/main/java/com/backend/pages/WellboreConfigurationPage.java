
package com.backend.pages;

import com.default_project.utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class WellboreConfigurationPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public WellboreConfigurationPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "topMDField")
    private WebElement topMDField;

    @FindBy(id = "bottomMDField")
    private WebElement bottomMDField;

    @FindBy(id = "lengthField")
    private WebElement lengthField;

    @FindBy(id = "casingField")
    private WebElement casingField;

    @FindBy(id = "gradeField")
    private WebElement gradeField;

    @FindBy(id = "drilledHoleTab")
    private WebElement drilledHoleTab;

    @FindBy(id = "casingTab")
    private WebElement casingTab;

    @FindBy(id = "saveConfigurationButton")
    private WebElement saveConfigurationButton;

    @FindBy(id = "refreshPageButton")
    private WebElement refreshPageButton;

    @FindBy(id = "dataVerificationElement")
    private WebElement dataVerificationElement;

    @FindBy(id = "otherFieldsStateElement")
    private WebElement otherFieldsStateElement;

    public void navigateToWellboreConfigurationPage() {
        try {
            driver.get("http://localhost/wellboreConfiguration");
            WebElement wellboreConfigPageHeader = driver.findElement(By.xpath("//h1[text()='Wellbore Configuration']"));
            String actualHeader = wellboreConfigPageHeader.getText();
            String expectedHeader = "Wellbore Configuration";
            Assert.assertEquals(actualHeader, expectedHeader, "Header does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDrilledHoleTab() {
        try {
            elementUtils.clickElement(drilledHoleTab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCasingTab() {
        try {
            elementUtils.clickElement(casingTab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterTopMD(String top_md) {
        try {
            elementUtils.clearAndSendKeys(topMDField, top_md);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterBottomMD(String bottom_md) {
        try {
            elementUtils.clearAndSendKeys(bottomMDField, bottom_md);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterLength(String length) {
        try {
            elementUtils.clearAndSendKeys(lengthField, length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterCasing(String casing) {
        try {
            elementUtils.clearAndSendKeys(casingField, casing);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterGrade(String grade) {
        try {
            elementUtils.clearAndSendKeys(gradeField, grade);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveConfiguration() {
        try {
            elementUtils.clickElement(saveConfigurationButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void refreshPage() {
        try {
            elementUtils.clickElement(refreshPageButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDataDisplayedCorrectly() {
        try {
            String actualData = elementUtils.getElementText(dataVerificationElement);
            String expectedData = "Expected Data"; // Replace with actual expected data
            Assert.assertEquals(actualData, expectedData, "Data does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void observeOtherFieldsState() {
        try {
            boolean isEnabled = elementUtils.isElementDisplayed(otherFieldsStateElement);
            Assert.assertTrue("Other fields should be enabled for data entry", isEnabled);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areOtherFieldsEnabled() {
        try {
            boolean isEnabled = elementUtils.isElementDisplayed(otherFieldsStateElement);
            Assert.assertTrue("Other fields should be enabled for data entry", isEnabled);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isConfigurationSavedSuccessfully() {
        // Implementation to verify if configuration is saved
        // This should include logic to check for a success message or confirmation
    }

    public void isPageRefreshedWithoutErrors() {
        // Implementation to verify if page refreshes without errors
        // This should include logic to check for any error messages or status
    }

    public void isDataRetainedCorrectly() {
        // Implementation to verify if data is retained correctly
        // This should include logic to check if previously entered data is still present
    }

    public void addRowsWithValidData(int numberOfRows) {
        // Implementation for adding valid rows
        // This should include logic to add rows and verify they are added correctly
    }

    public void addAdditionalRowsUntilLimit() {
        // Implementation for adding rows until limit
        // This should include logic to add rows until a specified limit is reached
    }
}