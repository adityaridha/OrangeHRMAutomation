package org.ohrm.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.ohrm.page.Pages;

public class DashboardStepDef extends Pages {
    @Then("user should be on dashboard page")
    public void userIsOnDashboardPage() {
        dashboardPage.validateOnPage();
    }

    @And("user click {string} menu")
    public void userClickMenu(String menu) throws InterruptedException {
        dashboardPage.clickMenu(menu);
    }
}
