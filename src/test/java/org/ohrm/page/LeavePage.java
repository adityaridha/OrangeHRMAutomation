package org.ohrm.page;

import org.ohrm.base.Data;
import org.ohrm.base.WebActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LeavePage extends WebActions {

    public static By leaveListText = By.xpath("//h5[contains(normalize-space(), 'Leave List')]");
    public static By toDateDatePicker = By.xpath("//label[text()='To Date']/parent::*/following-sibling::*//input");
    public static By fromDateDatePicker = By.xpath("//label[text()='From Date']/parent::*/following-sibling::*//input");
    public static By applyMenu = By.xpath("//*[contains(text(), 'Apply')]");
    public static By leaveTypeOptions = By.xpath("//*[contains(text(), '-- Select --')]");
    public static By balanceValue = By.className("orangehrm-leave-balance-text");
    public static By commentsTextBox = By.xpath("//textarea[contains(@class, \"oxd-textarea\")]");
    public static By applyButton = By.xpath("//button[contains(@class, \"oxd-button\")]");

    public void validateOnLeavePage() {
        assertElementDisplayed(leaveListText);
    }

    public void setFromDate(String date) {
        driver.findElement(fromDateDatePicker).sendKeys(date);
    }

    public void setEndDate(String date) {
        driver.findElement(toDateDatePicker).click();
//        driver.findElement(toDateDatePicker).sendKeys(date);
    }

    public void clickApplyMenu() {
        clickElement(applyMenu);
    }

    public void clickLeaveMenu(String menu) {
        By menuEl = By.xpath("//*[contains(text(), '" + menu + "')]");
        clickElement(menuEl);
    }

    public void selectLeaveType() {
        assertElementDisplayed(leaveTypeOptions);
        clickElement(leaveTypeOptions);
        new Actions(driver)
                .keyDown(Keys.DOWN)
                .keyDown(Keys.ENTER)
                .perform();
    }

    public String getActualLeaveBalance() {
        return driver.findElement(balanceValue).getText();
    }

    public void setLeaveBalanceValue() {
        Data.setLeaveBalance(getActualLeaveBalance());
    }

    public void setCommentValue(String text) {
        driver.findElement(commentsTextBox).sendKeys(text);
    }

    public void clickApplyButton() throws InterruptedException {
        driver.findElement(applyButton).click();
        Thread.sleep(10000);
    }
}
