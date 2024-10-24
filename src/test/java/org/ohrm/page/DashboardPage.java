package org.ohrm.page;

import org.ohrm.base.WebActions;
import org.openqa.selenium.By;

public class DashboardPage extends WebActions {

    public static By profileBadge = By.className("oxd-userdropdown-tab");
    public static By leaveMenu = By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']");
    public static By pimMenu = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");

    public void validateOnPage() {
        assertElementDisplayed(profileBadge);
        assertElementDisplayed(leaveMenu);
        assertElementDisplayed(profileBadge);
    }

    public void clickMenu(String menu) throws InterruptedException {
        switch (menu) {
            case "Leave":
                clickElement(leaveMenu);
                break;
            case "PIM":
                clickElement(pimMenu);
                break;
            default:
                System.out.println("menu option is not valid");
        }
        Thread.sleep(3000);
    }
}
