package org.ohrm.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ohrm.page.Pages;
import org.ohrm.utils.Utils;

public class LeaveStepDef extends Pages {

    @And("user should be on Leave menu")
    public void userShouldBeOnLeaveMenu() {
        leavePage.validateOnLeavePage();
    }

    @And("user select leave type")
    public void userSelectLeaveType() throws InterruptedException {
        leavePage.selectLeaveType();
        Thread.sleep(2000);
        leavePage.setLeaveBalanceValue();
    }

    @When("user click Apply Leave button")
    public void userClickApplyLeaveButton() throws InterruptedException {
        leavePage.clickApplyButton();
    }

    @And("user fill comment section with {string}")
    public void userFillCommentSectionWith(String comment) {
        leavePage.setCommentValue(comment);
    }

    @And("user click {string} on Leave menu")
    public void userClickOnLeaveMenu(String menu) throws InterruptedException {
        leavePage.clickLeaveMenu(menu);
        Thread.sleep(3000);
    }

    @When("user set from date to {string} and end date to {string}")
    public void userSetFromDateToAndEndDateTo(String fromDate, String endDate) throws InterruptedException {
        leavePage.setFromDate(fromDate);
        Thread.sleep(1000);
        leavePage.setEndDate(endDate);
    }

    @And("user check the current leave balance")
    public void userCheckTheCurrentLeaveBalance() {
        String currentBalance = leavePage.getActualLeaveBalance();
        System.out.println(Utils.extractInteger(currentBalance));
    }
}
