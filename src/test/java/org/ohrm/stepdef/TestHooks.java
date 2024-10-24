package org.ohrm.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.ohrm.page.DashboardPage;
import org.ohrm.page.LeavePage;
import org.ohrm.page.LoginPage;
import org.ohrm.page.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestHooks extends Pages {
    @Before
    public static void before() throws InterruptedException {
        setupDriver();
    }

    @After
    public static void after() {
        driver.quit();
    }


}
