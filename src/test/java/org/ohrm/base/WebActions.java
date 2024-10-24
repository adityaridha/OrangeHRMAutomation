package org.ohrm.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebActions extends DriverConfig {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickElement(By element) {
        driver.findElement(element).click();
    }

    public void assertElementDisplayed(By element) {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        if (!el.isDisplayed()) {
            throw new AssertionError("Element is not displayed.");
        }
    }
}
