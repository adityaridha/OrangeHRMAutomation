package org.ohrm.page;

import org.ohrm.base.WebActions;
import org.openqa.selenium.By;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends WebActions {
    public static By usernameField = By.name("username");
    public static By passwordField = By.name("password");
    public static By loginButton = By.xpath("//button[@type='submit']");

    public void goToLoginPage() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void inputUsername(String username) {
        assertElementDisplayed(usernameField);
        driver.findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password) {
        assertElementDisplayed(passwordField);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        assertElementDisplayed(loginButton);
        driver.findElement(loginButton).click();
    }

    public void validateErrorAppear(String errorMessage) {
        assertTrue(Objects.requireNonNull(driver.getPageSource()).contains(errorMessage));
    }
}
