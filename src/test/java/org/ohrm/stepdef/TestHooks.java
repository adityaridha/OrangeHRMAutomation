package org.ohrm.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.ohrm.BaseTest;

public class TestHooks extends BaseTest {
    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        driver.close();
    }
}
