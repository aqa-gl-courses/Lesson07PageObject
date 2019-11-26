package com.aqacourses.pageobject.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PythonPage extends AbstractPage {

    // Title constant
    private final String TITLE = "Selenium Framework | Python Course";

    // We should not have new instances a driver and wait in each page class
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Constructor
     *
     * @param driver
     */
    public PythonPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(pageDiv));
    }

    /** Verify that titles are the same */
    public void verifyTitle() {
        Assert.assertEquals("Titles are not the same", TITLE, driver.getTitle());
    }
}
