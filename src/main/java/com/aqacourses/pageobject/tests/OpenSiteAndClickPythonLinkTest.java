package com.aqacourses.pageobject.tests;

import com.aqacourses.pageobject.pages.HomePage;
import com.aqacourses.pageobject.pages.PythonPage;
import java.util.Collections;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenSiteAndClickPythonLinkTest {

    // It's not good practice to use driver in the test class
    private WebDriver driver;

    // It's not good to have URL in the test class
    private final String URL = "http://www.seleniumframework.com/";

    /** setUp() method to create something */
    @Before
    public void setUp() {
        // If you want to disable infobars please use this code
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption(
                "excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);

        // Initialize path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // Initialize instance of ChromeDriver and add options
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
    }

    /** Open site and click on Python link. Verify title */
    @Test
    public void testOpenSiteAndClickPythonLinkTest() {
        // Open site
        driver.get(URL);

        // Initialize HomePage
        HomePage homePage = new HomePage(driver);

        // Click on Python Link
        PythonPage pythonPage = homePage.clickPythonLink();

        // Verify title
        pythonPage.verifyTitle();
    }

    /** Make driver quits */
    @After
    public void tearDrop() {
        driver.quit();
    }
}
