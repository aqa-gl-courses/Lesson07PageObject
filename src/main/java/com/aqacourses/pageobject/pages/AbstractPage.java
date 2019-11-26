package com.aqacourses.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    private WebDriver driver;
    private WebDriverWait wait;

    /*
    Web elements with @FindBy annotation
     */
    @FindBy(xpath = "//ul[@id='main-nav']//span[.='PYTHON']/..")
    private WebElement pythonLink;

    @FindBy(xpath = "//div[@id='main']")
    protected WebElement pageDiv;

    /** Constructor */
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);  // Initialize WebElements
        wait.until(ExpectedConditions.visibilityOf(pageDiv));
    }

    /**
     * Click on Python link and get instance of page
     *
     * @return PythonPage
     */
    public PythonPage clickPythonLink() {
        wait.until(ExpectedConditions.elementToBeClickable(pythonLink)).click();
        return new PythonPage(driver);
    }
}
